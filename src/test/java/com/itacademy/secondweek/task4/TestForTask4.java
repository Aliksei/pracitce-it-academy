package com.itacademy.secondweek.task4;

import com.itcademy.secondweek.task4.service.ArrSorter;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static java.util.stream.Collectors.toList;

public class TestForTask4 {

    private static final int[] testData = new int[]{5, 3, 2, 13, 8, 1, 4, 9};
    private final ArrSorter arrSorter = new ArrSorter();

    @Test
    public void sortArray() {
        List<Integer> list = Arrays.stream(testData).boxed().collect(toList());
        System.out.println("Before: " + list);
        arrSorter.sort(list);
        System.out.println("_After: " + list);
    }

}
