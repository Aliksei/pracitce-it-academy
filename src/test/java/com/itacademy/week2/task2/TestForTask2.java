package com.itacademy.week2.task2;

import com.itcademy.week2.task2.service.AnagramFinder;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForTask2 {

    private static List<String> testData;
    private final AnagramFinder anagramFinder = new AnagramFinder();

    @BeforeClass
    public static void prepare() {
        testData = new ArrayList<>();
        testData.add("eat");
        testData.add("tea");
        testData.add("tan");
        testData.add("ate");
        testData.add("nat");
        testData.add("bat");
    }

    @Test
    public void checkFinding() {
        for(List<String> list : anagramFinder.findAnagrams(testData)) {
            System.out.println(list);
        }
    }

}
