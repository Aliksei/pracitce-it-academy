package com.itacademy.week3.task4;

import com.itacademy.week3.BaseTestForWeek3;
import com.itcademy.week3.task4.service.BinaryTreeValueCollector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForTask4 extends BaseTestForWeek3 {

    @Test
    public void checkInOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByBreadth(TEST_STING_TREE);
        System.out.println(result);
        assertEquals(result, result);
    }
}
