package fengfei.spruce.cache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CategoryCache {

    static Map<String, Map<Byte, String>> dir = new LinkedHashMap<>();

    static Map<Byte, String> cache = new LinkedHashMap<>();

    public static void put(byte key, String value) {
        cache.put(key, value);
    }

    public static String get(byte key) {
        return cache.get(key);
    }

    public static Map<Byte, String> getAll() {
        return cache;
    }

}
