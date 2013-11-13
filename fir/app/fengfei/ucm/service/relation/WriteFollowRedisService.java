package fengfei.ucm.service.relation;

import fengfei.shard.redis.RedisCommand;
import fengfei.ucm.service.WriteFollowService;

import java.util.ArrayList;
import java.util.List;

public class WriteFollowRedisService implements WriteFollowService {
    private RedisCommand writer;

    public WriteFollowRedisService(RedisCommand writer) {
        this.writer = writer;
    }

    @Override
    public boolean add(ArrayList<Object> results, long sourceId, long targetId, byte type) throws Exception {
        String key = KeyGenerator.genFollowing(sourceId, type);
        String value = String.valueOf(targetId);
        long updated = writer.sadd(key, value);
        return updated > 0;
    }

    @Override
    public boolean remove(ArrayList<Object> results, long sourceId, long targetId, byte type) throws Exception {
        String key = KeyGenerator.genFollowing(sourceId, type);
        String value = String.valueOf(targetId);
        long updated = writer.srem(key, value);
        return updated > 0;
    }

    @Override
    public boolean add(ArrayList<Object> results, long sourceId, List<Long> targetIds, byte type) throws Exception {
        String key = KeyGenerator.genFollowing(sourceId, type);
        String[] value = new String[targetIds.size()];
        for (int i = 0; i < targetIds.size(); i++) {
            value[i] = String.valueOf(targetIds.get(i));
        }
        long updated = writer.sadd(key, value);
        return updated > 0;
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
}
