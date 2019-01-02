package com.itacademy.week3.task3;

import com.itacademy.week3.BaseTestForWeek3;
import com.itcademy.week3.task3.service.BinaryTreeValueCollector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForTask3 extends BaseTestForWeek3 {

    @Test
    public void checkInOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByInOrderTraverse(TEST_STING_TREE);
        assertEquals(result, result);
    }

    @Test
    public void checkPreOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByPreOrderTraverse(TEST_STING_TREE);
        assertEquals(result, result);
    }

    @Test
    public void checkPostOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByPostOrderTraverse(TEST_STING_TREE);
        assertEquals(result, result);
    }

}
