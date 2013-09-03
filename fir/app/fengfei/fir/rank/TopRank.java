package fengfei.fir.rank;

import java.util.Set;

import fengfei.shard.redis.RedisComand;

public class TopRank {

    final static String RankPopularKey = "RankTop";
    final static double MaxScore = 100D;
    private String topRankKey = RankPopularKey;
    public static RedisComand read;
    public static RedisComand write;

    public static void main(String[] args) {
        // t: current time, b: begInnIng value, c: change In value, d: duration
        int t, b = 1, c = 1, d = 100;

        for (int i = 0; i < 100; i++) {
            t = i;
            int x = c * ((t = t / d - 1) * t * t * t * t + 1) + b;

            System.out.println(x);
        }
    }

    public void setTopRankKey(String key) {
        topRankKey = key;
    }

    public double incr(String id, int percent) {
        percent = percent > 50 ? 50 : percent;
        Double d = write.zscore(topRankKey, id);
        double incr = (MaxScore - (d == null ? 0d : d)) * percent / 100;
        Double score = write.zincrby(topRankKey, (incr < 0 ? 0d : incr), id);
        return score;
    }

    public double incrPercent50(String id) {
        return incr(id, 50);
    }

    public double incrPercent25(String id) {
        return incr(id, 25);
    }

    public double incrPercent10(String id) {
        return incr(id, 10);
    }

    public Set<String> find(int offset, int count) {
        return read.zrevrangeByScore(topRankKey, 100D, 0D, offset, count);
    }

    public long removeExpired() {
        return 0;
    }

}
