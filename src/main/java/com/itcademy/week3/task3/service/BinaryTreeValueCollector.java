package com.itcademy.week3.task3.service;

import com.itcademy.common.entity.TreeNode;
import java.util.Stack;

@SuppressWarnings({"Duplicates", "unchecked"})
public class BinaryTreeValueCollector {

    public static String collectByPreOrderTraverse(final TreeNode tree) {
        Stack<TreeNode> nodes = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        nodes.push(tree);
        while (!nodes.empty()) {
            TreeNode current = nodes.pop();
            stringBuilder.append(current.getValue() + " ");
            if (current.getRight() != null) {
                nodes.push(current.getRight());
            }
            if (current.getLeft() != null) {
                nodes.push(current.getLeft());
            }
        }
        return stringBuilder.toString();
    }

    public static String collectByInOrderTraverse(final TreeNode tree) {
        Stack<TreeNode> nodes = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        TreeNode rootTree = tree;
        while (!nodes.isEmpty() || rootTree != null) {
            if (rootTree != null) {
                nodes.push(rootTree);
                rootTree = rootTree.getLeft();
            } else {
                TreeNode node = nodes.pop();
                stringBuilder.append(node.getValue());
                rootTree = node.getRight();
            }
        }
        return stringBuilder.toString();
    }

    public static <T> String collectByPostOrderTraverse(final TreeNode<?> tree) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(tree);
        Stack<T> out = new Stack<>();
        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            out.push((T) curr.getValue());
            if (curr.getLeft() != null) {
                stack.push(curr.getLeft());
            }
            if (curr.getRight() != null) {
                stack.push(curr.getRight());
            }
        }
        while (!out.empty()) {
            stringBuilder.append(out.pop());
        }
        return stringBuilder.toString();
    }

}
