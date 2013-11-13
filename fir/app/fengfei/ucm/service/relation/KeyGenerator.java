package fengfei.ucm.service.relation;

import redis.clients.util.SafeEncoder;

/**
 * @Date: 13-11-11
 * @Time: 下午5:53
 */
public class KeyGenerator {
    final static String Following = ">";
    final static String Followed = "<";

    public static String genFollowing(long sourceId, byte type) {
        return new StringBuffer().append(sourceId).append(Following).append(Integer.toHexString(type)).toString();
    }

    public static String genFollowed(long targetId, byte type) {
        return new StringBuffer().append(targetId).append(Followed).append(Integer.toHexString(type)).toString();
    }

    public static byte[] genFollowingKey(long sourceId, byte type) {
        return SafeEncoder.encode(genFollowing(sourceId, type));
    }

    public static byte[] genFollowedKey(long targetId, byte type) {
        return SafeEncoder.encode(genFollowed(targetId, type));
    }
}
