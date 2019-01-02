package com.itacademy.week3.task1;

import com.itacademy.week3.BaseTestForWeek3;
import com.itcademy.week3.task1.service.BinaryTreeNodesCounter;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestForTask1 extends BaseTestForWeek3 {

    @Test
    public void checkNodesCounting() {
        int numberOfNodes = BinaryTreeNodesCounter.countNodes(TEST_TREE);
        assertEquals(9, numberOfNodes);
    }

}
