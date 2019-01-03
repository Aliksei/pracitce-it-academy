package com.itcademy.week3.entity;

import com.itcademy.week3.task4.service.BinaryTreeValueCollector;
import lombok.Getter;

@SuppressWarnings("unchecked")
@Getter
public class Tree<T extends Comparable> {

    private Tree left;
    private Tree right;
    private T value;

    public Tree(T value) {
        this.value = value;
    }

    public void insert(T value) {
        insert(new Tree(value));
    }

    public void insert(Tree<T> tree) {
        if (tree.value.compareTo(value) < 0) {
            if (left != null) {
                left.insert(tree);
            } else {
                left = tree;
            }
        } else {
            if (right != null) {
                right.insert(tree);
            } else {
                right = tree;
            }
        }
    }

    public int countNodes() {
        Tree<T> left = getLeft();
        Tree<T> right = getRight();
        return 1 + (left != null ? left.countNodes() : 0) + (right != null ? right.countNodes() : 0);
    }

}
