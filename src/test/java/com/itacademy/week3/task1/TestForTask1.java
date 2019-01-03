package com.itacademy.week3.task1;

import com.itcademy.week3.task1.service.BinaryTreeNodesCounter;
import org.junit.Test;

import static com.itacademy.week3.TestDataWeek3.TEST_TREE;
import static org.junit.Assert.assertEquals;

public class TestForTask1 {

    @Test
    public void checkNodesCounting() {
        int numberOfNodes = BinaryTreeNodesCounter.countNodes(TEST_TREE);
        assertEquals(9, numberOfNodes);
    }

}
