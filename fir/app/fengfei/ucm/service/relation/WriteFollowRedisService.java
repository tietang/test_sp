package fengfei.ucm.service.relation;

import fengfei.shard.redis.RedisCommand;
import fengfei.ucm.service.WriteFollowService;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.ArrayList;
import java.util.List;

public class WriteFollowRedisService implements WriteFollowService {
    private RedisCommand writer;

    public WriteFollowRedisService(RedisCommand writer) {
        this.writer = writer;
    }

    private interface Callback<T> {
        T execute(Transaction transaction);

    }

    private <T> T execute(Callback<T> callback) {
        Transaction transaction = null;
        try {
            transaction = writer.multi();
            T t = callback.execute(transaction);
            transaction.exec();
            return t;
        } catch (Throwable e) {
            throw e;
        }

    }

    @Override
    public boolean add(ArrayList<Object> results, final long sourceId, final long targetId, final byte type) throws Exception {
        Boolean updated = execute(new Callback<Boolean>() {
            @Override
            public Boolean execute(Transaction transaction) {
                String fkey = KeyGenerator.genFollowing(sourceId, type);
                String fvalue = String.valueOf(targetId);
                transaction.sadd(fkey, fvalue);
                //
                String bkey = KeyGenerator.genFollowed(targetId, type);
                String bvalue = String.valueOf(sourceId);
                transaction.sadd(bkey, bvalue);
                return true;
            }
        });

        return updated == null ? false : updated;
    }

    @Override
    public boolean remove(ArrayList<Object> results, final long sourceId, final long targetId, final byte type) throws Exception {

        Boolean updated = execute(new Callback<Boolean>() {
            @Override
            public Boolean execute(Transaction transaction) {
                String fkey = KeyGenerator.genFollowing(sourceId, type);
                String fvalue = String.valueOf(targetId);
                transaction.srem(fkey, fvalue);
                //
                String bkey = KeyGenerator.genFollowed(targetId, type);
                String bvalue = String.valueOf(sourceId);
                transaction.srem(bkey, bvalue);
                return true;
            }
        });

        return updated == null ? false : updated;
    }

    @Override
    public boolean add(ArrayList<Object> results, final long sourceId, final List<Long> targetIds, final byte type) throws Exception {

        Boolean updated = execute(new Callback<Boolean>() {
            @Override
            public Boolean execute(Transaction transaction) {
                String key = KeyGenerator.genFollowing(sourceId, type);
                String[] value = new String[targetIds.size()];
                for (int i = 0; i < targetIds.size(); i++) {
                    value[i] = String.valueOf(targetIds.get(i));
                }
                long updated = writer.sadd(key, value);


                //
                String bvalue = String.valueOf(sourceId);
                for (int i = 0; i < targetIds.size(); i++) {
                    long targetId = targetIds.get(i);
                    String bkey = KeyGenerator.genFollowed(targetId, type);
                    transaction.sadd(bkey, bvalue);
                }

                return true;
            }
        });

        return updated == null ? false : updated;
    }

    @Override
    public boolean remove(ArrayList<Object> results, long sourceId, List<Long> targetIds, byte type) throws Exception {
        String key = KeyGenerator.genFollowing(sourceId, type);
        String[] value = new String[targetIds.size()];
        for (int i = 0; i < targetIds.size(); i++) {
            value[i] = String.valueOf(targetIds.get(i));
        }
        long updated = writer.srem(key, value);
        return updated > 0;
    }

    //attachment
    @Override
    public boolean add(ArrayList<Object> results, long sourceId, long targetId, byte type, long attachmentId) throws Exception {
        String key = KeyGenerator.genMessageFollowing(sourceId, type);
        String value = String.valueOf(targetId);
        long updated = writer.sadd(key, value);
        return updated > 0;
    }

    @Override
    public boolean remove(ArrayList<Object> results, long sourceId, long targetId, byte type, long attachmentId) throws Exception {
        String key = KeyGenerator.genMessageFollowing(sourceId, type);
        String value = String.valueOf(targetId);
        long updated = writer.srem(key, value);
        return updated > 0;
    }

    @Override
    public boolean add(ArrayList<Object> results, long sourceId, List<Long> targetIds, byte type, long attachmentId) throws Exception {
        String key = KeyGenerator.genMessageFollowing(sourceId, type);
        String[] value = new String[targetIds.size()];
        for (int i = 0; i < targetIds.size(); i++) {
            value[i] = String.valueOf(targetIds.get(i));
        }
        long updated = writer.sadd(key, value);
        return updated > 0;
    }

    @Override
    public boolean remove(ArrayList<Object> results, long sourceId, List<Long> targetIds, byte type, long attachmentId) throws Exception {
        String key = KeyGenerator.genMessageFollowing(sourceId, type);
        String[] value = new String[targetIds.size()];
        for (int i = 0; i < targetIds.size(); i++) {
            value[i] = String.valueOf(targetIds.get(i));
        }
        long updated = writer.srem(key, value);
        return updated > 0;
    }


}
