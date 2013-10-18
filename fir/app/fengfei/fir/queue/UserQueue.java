package fengfei.fir.queue;

import fengfei.ucm.entity.profile.UserPwd;

/**
 */
public class UserQueue {
    public static QueueService queueService = new QueueServiceFQueueImpl();

    public static void add(UserPwd user) {
        QueueMessage<UserPwd> message = new QueueMessage<>(QueueMessage.MessageType.User, QueueMessage.OperationType.Add, user);
        queueService.add(message);
    }

    public static void update(UserPwd user) {
        QueueMessage<UserPwd> message = new QueueMessage<>(QueueMessage.MessageType.User, QueueMessage.OperationType.Update, user);
        queueService.add(message);
    }

    public static void delete(UserPwd user) {
        QueueMessage<UserPwd> message = new QueueMessage<>(QueueMessage.MessageType.User, QueueMessage.OperationType.Delete, user);
        queueService.add(message);
    }
}
