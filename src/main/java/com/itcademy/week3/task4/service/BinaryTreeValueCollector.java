package com.itcademy.week3.task4.service;

import com.itcademy.week3.entity.Tree;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeValueCollector {

    public static String collectByBreadth(final Tree tree) {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(tree);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Tree node = queue.poll();
            sb.append(node.getValue());
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
