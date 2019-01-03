package com.itcademy.week3.task1.service;

import com.itcademy.week3.entity.Tree;
import java.util.Deque;
import java.util.Stack;

public class BinaryTreeNodesCounter {

    /**
     * recursive method is in Tree entity , see method count() {@link Tree}
     */

    public static int countNodes(final Tree<?> tree) {
        Stack<Tree> nodes = new Stack<>();
        nodes.push(tree);
        int count = 0;
        while (!nodes.empty()) {
            count++;
            Tree current = nodes.pop();
            if (current.getRight() != null) {
                nodes.push(current.getRight());
            }
            if (current.getLeft() != null) {
                nodes.push(current.getLeft());
            }
        }
        return count;
    }

}
