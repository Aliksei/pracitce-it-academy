package com.itcademy.week3.task4.service;

import com.itcademy.common.entity.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeValueCollector {

    public static String collectByBreadth(final TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sb.append(node.getValue()).append(" ");
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return sb.toString();
    }

}
