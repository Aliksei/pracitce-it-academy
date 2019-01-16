package com.itcademy.week3.task1.service;

import com.itcademy.common.entity.TreeNode;
import java.util.Stack;

public class BinaryTreeNodesCounter {

    /**
     * recursive method is in Tree entity , see method count() {@link TreeNode}
     */

    public static int countNodes(final TreeNode<?> tree) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(tree);
        int count = 0;
        while (!nodes.empty()) {
            count++;
            TreeNode current = nodes.pop();
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
