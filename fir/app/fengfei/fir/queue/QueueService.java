package fengfei.fir.queue;

/**
 */
public interface QueueService<T> {
    void start() throws Exception;

    void add(T item);

    T getOne(Class<T> clazz);

    void close();

}
