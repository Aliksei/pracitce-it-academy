package com.itacademy.week3.task4;

import com.itcademy.week3.task4.service.BinaryTreeValueCollector;
import org.junit.Test;

import static com.itacademy.week3.TestDataWeek3.TEST_STING_TREE;
import static org.junit.Assert.assertEquals;

public class TestForTask4 {

    @Test
    public void checkInOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByBreadth(TEST_STING_TREE);
        assertEquals("JFKERANUOSQ", result);
    }
}
