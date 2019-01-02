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

    public void traversePostOrder() {
        if (left != null)
            left.traversePostOrder();
        if (right != null)
            right.traversePostOrder();
        System.out.println(value);
    }

    public void traverseInOrder() {
        if (left != null)
            left.traverseInOrder();
        System.out.println(value);
        if (right != null)
            right.traverseInOrder();
    }

    public void traversePreOrder() {
        System.out.println(value);
        if (left != null)
            left.traversePreOrder();
        if (right != null)
            right.traversePreOrder();
    }

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>(40);
        tree.insert(20);
        tree.insert(30);
        tree.insert(50);
        tree.insert(55);
        tree.insert(53);
        tree.insert(18);
        tree.insert(31);
        tree.insert(28);

        String a = com.itcademy.week3.task3.service.BinaryTreeValueCollector.collectByPreOrderTraverse(tree);
        System.out.println(a);
        System.out.println();
        String b = com.itcademy.week3.task3.service.BinaryTreeValueCollector.collectByInOrderTraverse(tree);
        System.out.println(b);
        System.out.println();
        String c = com.itcademy.week3.task3.service.BinaryTreeValueCollector.collectByPostOrderTraverse(tree);
        System.out.println(c);
        System.out.println();
    }


}
