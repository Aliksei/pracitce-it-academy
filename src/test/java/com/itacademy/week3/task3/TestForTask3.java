package com.itacademy.week3.task3;

import com.itcademy.week3.task3.service.BinaryTreeValueCollector;
import org.junit.Test;

import static com.itacademy.week3.TestDataWeek3.TEST_STING_TREE;
import static org.junit.Assert.assertEquals;

public class TestForTask3 {

    @Test
    public void checkInOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByInOrderTraverse(TEST_STING_TREE);
        assertEquals("AEFJKNOQRSU", result);
    }

    @Test
    public void checkPreOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByPreOrderTraverse(TEST_STING_TREE);
        assertEquals("JFEAKRNOQUS", result);
    }

    @Test
    public void checkPostOrderCollecting() {
        String result = BinaryTreeValueCollector.collectByPostOrderTraverse(TEST_STING_TREE);
        assertEquals("AEFQONSURKJ", result);
    }

}
