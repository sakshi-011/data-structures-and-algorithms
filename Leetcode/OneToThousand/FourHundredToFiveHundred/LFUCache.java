package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javafx.util.Pair;

class _LFUCache {

    private int capacity;
    private Map<Integer,Pair<Integer,Integer>> cache;
    private Map<Integer,LinkedHashSet<Integer>> counter;
    private int minFrequency;

    public _LFUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        counter = new HashMap<>();
    }

    public void insert(int key, int freq, int val){
        cache.put(key,new Pair<>(freq,val));
        counter.putIfAbsent(freq,new LinkedHashSet<>());
        counter.get(freq).add(key);
    }

    public int get(int key) {
        Pair<Integer,Integer> x = cache.get(key);
        if(x == null)
            return -1;
        int freq = x.getKey();
        Set<Integer> set = counter.get(freq);
        set.remove(key);
        if(minFrequency == freq && set.isEmpty())
            ++minFrequency;
        int val = x.getValue();
        insert(key, freq+1, val);
        return val;
    }

    public void put(int key, int value) {
        if(capacity <= 0)
            return ;
        Pair<Integer,Integer> x = cache.get(key);
        if(x != null) {
            cache.put(key, new Pair<>(x.getKey(), value));
            get(key);
            return;
        }
        if(capacity == cache.size()){
            Set<Integer> set = counter.get(minFrequency);
            int del = set.iterator().next();
            cache.remove(del);
            set.remove(del);
        }
        minFrequency = 1;
        insert(key,1,value);
    }

}

public class LFUCache {

    public static void main(String[] args) {
        _LFUCache c = new _LFUCache(2);
        c.put(1,1);
        c.put(2,2);
        System.out.println(c.get(1));
        c.put(3,3);
        System.out.println(c.get(2));
        System.out.println(c.get(3));
        c.put(4,4);
        System.out.println(c.get(1));
        System.out.println(c.get(4));
    }

}
