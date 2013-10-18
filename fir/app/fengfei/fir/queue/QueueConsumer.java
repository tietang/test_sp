package fengfei.fir.queue;

import fengfei.fir.search.lucene.TagIndexCreator;
import fengfei.fir.utils.PausableLock;
import fengfei.ucm.entity.photo.Photo;

/**
 */
public class QueueConsumer implements Runnable {
    public static QueueService queueService = new QueueServiceFQueueImpl();
    public static PausableLock pausableLock = new PausableLock();
    private long timeout = 2000;
    TagIndexCreator creator;

    public QueueConsumer(TagIndexCreator creator) {
        this.creator = creator;
    }

    @Override
    public void run() {
        pausableLock.setPaused(true);
        while (true) {
            QueueMessage<?> message = queueService.poll();
            try {
                if (message == null) {
                    pausableLock.pause(timeout);
                } else {
                    process(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void process(QueueMessage<?> message) throws Exception {
        if (message.getData() instanceof Photo) {
            Photo photo = (Photo) message.getData();
            switch (message.getOperationType()) {
                case Add:
                    creator.add(photo);
                    break;
                case Update:
                    creator.updateByID(photo);
                    break;
                case Delete:
                    creator.delete(String.valueOf(photo.idPhoto));
                    break;
            }

        }
    }
}
