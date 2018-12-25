package com.itcademy.secondweek.task3.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DominantFinder {

    public int find(final List<Integer> list) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        new HashSet<>(list).forEach(el -> map.put(el, Collections.frequency(list, el)));

        AtomicInteger max = new AtomicInteger();
        AtomicInteger maxKey = new AtomicInteger();
        map.forEach( (k, v) -> {
            if(v > max.get()) {
                max.set(v);
                maxKey.set(k);
            }
        });
        map.forEach( (k, v) -> {
            if (v < max.get() ) {
                map.remove(k, v);
            }
        });
        if (map.size() == 1) {
            System.out.println("Dominate number :");
            System.out.println(map);
            return map.keys().nextElement();
        } else {
            System.out.println(map);
            throw new RuntimeException("There are no dominate number, winner not found");
        }
    }

}
