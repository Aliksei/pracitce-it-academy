package com.itcademy.week2.task2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class AnagramFinder {

    public List<List<String>> findAnagrams(final List<String> list) {
        List<String> listOfSorted = list.stream()
                .map(this::sortString)
                .collect(toList());
        Set<String> set = new LinkedHashSet<>(listOfSorted);

        List<List<String>> allAnagrams = new ArrayList<>();
        set.forEach(el -> {
            List<String> anagrams = new ArrayList<>();
            ListIterator<String> it = listOfSorted.listIterator();
            while (it.hasNext()) {
                String current = it.next();
                if (current.equals(el)) {
                    anagrams.add(list.get(it.nextIndex() - 1));
                }
            }
            Collections.sort(anagrams);
            allAnagrams.add(anagrams);
        });
        return allAnagrams;
    }

    private String sortString(final String s) {
        char[] tempArr = s.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }

}
