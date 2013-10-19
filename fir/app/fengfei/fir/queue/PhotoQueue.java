package fengfei.fir.queue;

import fengfei.ucm.entity.photo.Photo;

/**
 */
public class PhotoQueue {
    public static QueueService queueService = new QueueServiceFQueueImpl();

    public static void add(Photo photo) {
        QueueMessage<Photo> message = new QueueMessage<>(QueueMessage.MessageType.Photo, QueueMessage.OperationType.Add, photo);
        queueService.add(message);
    }

    public static void update(Photo photo) {
        QueueMessage<Photo> message = new QueueMessage<>(QueueMessage.MessageType.Photo, QueueMessage.OperationType.Update, photo);
        queueService.add(message);
    }

    public static void delete(Photo photo) {
        QueueMessage<Photo> message = new QueueMessage<>(QueueMessage.MessageType.Photo, QueueMessage.OperationType.Delete, photo);
        queueService.add(message);
    }
}
