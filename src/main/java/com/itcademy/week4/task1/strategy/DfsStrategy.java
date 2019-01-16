package com.itcademy.week4.task1.strategy;

import com.itcademy.common.entity.Tree;
import java.util.ArrayDeque;

import java.util.Deque;
import java.util.NoSuchElementException;

public class DfsStrategy implements TraversStrategy {

    private static final DfsStrategy INSTANCE = new DfsStrategy();

    private Deque<Tree<? extends Comparable<?>>> deque = new ArrayDeque<>();

    private DfsStrategy() {
    }

    public static DfsStrategy getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Comparable<T>> Tree<T> getNext(Class<T> clazz) {
        if (isEmpty()) {
            throw new NoSuchElementException("All nodes have been visited!");
        }
        Tree<T> currentNode = (Tree<T>) deque.pop();
        if (currentNode.getRight() != null) {
            deque.push(currentNode.getRight());
        }
        if (currentNode.getLeft() != null) {
            deque.push(currentNode.getLeft());
        }
        return currentNode;
    }

    @Override
    public <T extends Comparable<T>> void setTree(Tree<T> tree) {
        deque.push(tree);
    }

}
