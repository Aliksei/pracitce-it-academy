package com.itcademy.common.entity;

import com.itcademy.week4.task1.strategy.DfsStrategy;
import com.itcademy.week4.task1.strategy.TraversStrategy;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class TreeNode<T extends Comparable<T>> implements Tree<T> {

    private TreeNode<T> left;
    private TreeNode<T> right;
    private T value;

    public TreeNode(T value) {
        this.value = value;
    }

    @Override
    public void insert(T value) {
        insert(new TreeNode(value));
    }

    public void insert(TreeNode<T> tree) {
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

    @Override
    public TreeNode<T> getRight() {
        return right;
    }

    @Override
    public TreeNode<T> getLeft() {
        return left;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public Iterator<Tree<T>> iterator() {
        return new TreeIterator(this);
    }

    @Override
    public Iterator<Tree<T>> iterator(TraversStrategy strategy) {
        return new TreeIterator(this, strategy);
    }

    private class TreeIterator implements Iterator<Tree<T>> {

        private final Class<T> clazz = (Class<T>) getValue().getClass();

        private TraversStrategy strategy = DfsStrategy.getInstance();

        private TreeIterator(final Tree<T> node, final TraversStrategy strategy) {
            strategy.setTree(node);
            this.strategy = strategy;
        }

        private TreeIterator(final Tree<T> node) {
            strategy.setTree(node);
        }

        @Override
        public boolean hasNext() {
            return !strategy.isEmpty();
        }

        @Override
        public Tree<T> next() {
            return strategy.getNext(clazz);
        }

    }

}
