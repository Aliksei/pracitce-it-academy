package com.itacademy.week3.task2;

import com.itacademy.week3.BaseTestForWeek3;
import com.itcademy.week3.task2.service.BinaryTreeDepthFinder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForTask2 extends BaseTestForWeek3 {

    @Test
    public void checkDepthFinder() {
        int numberOfNodes = BinaryTreeDepthFinder.maxDepth(TEST_TREE);
        assertEquals(4, numberOfNodes);
    }

}
