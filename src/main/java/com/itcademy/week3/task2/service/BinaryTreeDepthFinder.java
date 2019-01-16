package com.itcademy.week3.task2.service;


import com.itcademy.common.entity.TreeNode;

public class BinaryTreeDepthFinder {

    public static int maxDepth(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(tree.getRight()), maxDepth(tree.getLeft()));
    }
}
