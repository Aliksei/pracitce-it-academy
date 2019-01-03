package com.itacademy.week3.task2;

import com.itcademy.week3.task2.service.BinaryTreeDepthFinder;
import org.junit.Test;

import static com.itacademy.week3.TestDataWeek3.TEST_TREE;
import static org.junit.Assert.assertEquals;

public class TestForTask2 {

    @Test
    public void checkDepthFinder() {
        int numberOfNodes = BinaryTreeDepthFinder.maxDepth(TEST_TREE);
        assertEquals(4, numberOfNodes);
    }

}
