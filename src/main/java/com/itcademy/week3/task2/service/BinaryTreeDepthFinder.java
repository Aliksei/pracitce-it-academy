package com.itcademy.week3.task2.service;


import com.itcademy.week3.entity.Tree;

public class BinaryTreeDepthFinder {

    public static int maxDepth(Tree tree) {
        if (tree == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(tree.getRight()), maxDepth(tree.getLeft()));
    }
}
