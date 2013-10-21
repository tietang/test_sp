package fengfei.web.app.init;

import fengfei.fir.queue.*;
import fengfei.fir.search.lucene.LuceneFactory;
import fengfei.fir.search.lucene.PhotoIndexCreator;
import fengfei.fir.utils.PausableLock;
import play.Play;
import play.PlayPlugin;

import java.util.Properties;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SearchPlugin extends PlayPlugin {


    @Override
    public void onApplicationStart() {
        Properties p = Play.configuration;
        String queueName = p.getProperty("queue.name.photo");
        String queuePath = p.getProperty("fqueue.file.path");
        String lucenePath = p.getProperty("lucene.index.path");
        String coreSize = p.getProperty("queue.consumer.corePoolSize");
        String maximumSize = p.getProperty("queue.consumer.maximumPoolSize");
        String keepAliveTimeStr = p.getProperty("queue.consumer.keepAliveTime");
        int corePoolSize = Integer.parseInt(coreSize);
        int maximumPoolSize = Integer.parseInt(maximumSize);
        long keepAliveTime = Long.parseLong(keepAliveTimeStr);

        LuceneFactory factory = LuceneFactory.get(lucenePath);
        QueueService queueService = new QueueServiceFQueueImpl(queueName, queuePath);
        PausableLock photoPausableLock = new PausableLock();
        PhotoQueue.queueProducer = new QueueProducer(queueService, photoPausableLock);
        PhotoIndexCreator creator = new PhotoIndexCreator(factory);
        PhotoQueueConsumer photoQueueConsumer = new PhotoQueueConsumer(queueService, photoPausableLock, creator);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                corePoolSize,// corePoolSize
                maximumPoolSize,// maximumPoolSize
                keepAliveTime,// keepAliveTime
                TimeUnit.MILLISECONDS,// TimeUnit
                new SynchronousQueue<Runnable>());
        for (int i = 0; i < corePoolSize; i++) {
            poolExecutor.execute(photoQueueConsumer);
        }

    }


}
