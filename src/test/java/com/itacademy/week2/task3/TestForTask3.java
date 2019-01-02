package com.itacademy.week2.task3;

import com.itcademy.week2.task3.service.DominantFinder;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class TestForTask3 {

    private static final int[] testData = new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3, 3};
    private static List<Integer> testList;
    private final DominantFinder dominantFinder = new DominantFinder();

    @BeforeClass
    public static void preprare() {
        testList = Arrays.stream(testData).boxed().collect(toList());
    }

    @Test
    public void checkDominantElement() {
        assertEquals(dominantFinder.find(testList), 3);
    }

}
