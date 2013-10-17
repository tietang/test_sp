package fengfei.fir.queue;

import com.google.code.fqueue.FQueue;
import fengfei.fir.serializer.KryoSerializer;
import fengfei.fir.serializer.ObjectSerializer;

/**
 */
public class QueueServiceDiskImpl<T> implements QueueService<T> {
    final static String QueueName = "q1";
    private ObjectSerializer serializer = new KryoSerializer();
    private String path;
    private String queueName;
    private FQueue queue;

    public QueueServiceDiskImpl(String queueName, String path) {
        this.queueName = queueName;
        this.path = path;
    }

    public void setSerializer(ObjectSerializer serializer) {
        this.serializer = serializer;
    }

    public void start() throws Exception {
        queue = new FQueue(path);
    }

    @Override
    public void add(T item) {
        byte[] bytes = serializer.write(item);
        queue.add(bytes);
    }

    @Override
    public T getOne(Class<T> clazz) {
        byte[] bytes = queue.poll();
        if (bytes == null) return null;
        return serializer.read(bytes, clazz);
    }

    public void close() {
        queue.close();
    }

    public static void main(String[] args) throws Exception {
        QueueService<String> qs = new QueueServiceDiskImpl<>("q1", "/opt/xx/index");
        qs.start();
        for (int i = 0; i < 100; i++) {
            qs.add("item" + i);
        }
        for (int i = 0; i < 150; i++) {
            String s = qs.getOne(String.class);
            if (s == null) {
                System.out.println("0");
            } else System.out.println(s);
        }
        qs.close();
    }
}
