package fengfei.ucm.service.relation;

import redis.clients.util.SafeEncoder;

/**
 * @Date: 13-11-11
 * @Time: 下午5:53
 */
public class KeyGenerator {
    final static String FriendPrefix = "F";
    final static String MessagePrefix = "M";
    final static String Following = ">";
    final static String Followed = "<";

    public static String genFollowing(long sourceId, byte type) {
        return new StringBuffer().append(FriendPrefix).append(sourceId).append(Following).append(Integer.toHexString(type)).toString();
    }

    public static String genFollowed(long targetId, byte type) {
        return new StringBuffer().append(FriendPrefix).append(targetId).append(Followed).append(Integer.toHexString(type)).toString();
    }

    public static byte[] genFollowingKey(long sourceId, byte type) {
        return SafeEncoder.encode(genFollowing(sourceId, type));
    }

    public static byte[] genFollowedKey(long targetId, byte type) {
        return SafeEncoder.encode(genFollowed(targetId, type));
    }

    //attachment
    public static String genMessageFollowing(long sourceId, byte type) {
        return new StringBuffer().append(MessagePrefix).append(sourceId).append(Following).append(Integer.toHexString(type)).toString();
    }

    public static String genMessageFollowed(long targetId, byte type) {
        return new StringBuffer().append(MessagePrefix).append(targetId).append(Followed).append(Integer.toHexString(type)).toString();
    }

    public static byte[] genMessageFollowingKey(long sourceId, byte type) {
        return SafeEncoder.encode(genMessageFollowing(sourceId, type));
    }

    public static byte[] genMessageFollowedKey(long targetId, byte type) {
        return SafeEncoder.encode(genMessageFollowed(targetId, type));
    }
}
