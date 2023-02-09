package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

public class LRUCache {

    private static LinkedHashMap<Integer,Integer> cache;
    private static int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap();
    }

    public static int get(int key) {
        if(cache.containsKey(key)){
            int val = cache.get(key);
            cache.remove(key);
            cache.put(key,val);
            return val;
        }
        return -1;
    }

    public static void put(int key, int value) {
        cache.remove(key);
        cache.put(key,value);
        if(cache.size() > capacity){
            List<Integer> keys = new ArrayList<Integer>(cache.keySet());
            cache.remove(keys.get(0));
        }
    }

    public static void main(String[] args) {
        LRUCache c = new LRUCache(2);
        c.put(1,1);
        c.put(2, 2);
        System.out.println(c.get(1));
        c.put(3, 3);
        System.out.println(c.get(2));
        c.put(4, 4);
        System.out.println(c.get(1));
        System.out.println(c.get(3));
        System.out.println(c.get(4));
    }

}
