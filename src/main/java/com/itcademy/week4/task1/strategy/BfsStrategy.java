package com.itcademy.week4.task1.strategy;

import com.itcademy.common.entity.Tree;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BfsStrategy implements TraversStrategy {

    private static final BfsStrategy INSTANCE = new BfsStrategy();

    private Queue<Tree<? extends Comparable<?>>> queue = new LinkedList<>();

    private BfsStrategy() {
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Comparable<T>> Tree<T> getNext(Class<T> clazz) {
        if (isEmpty()) {
            throw new NoSuchElementException("All nodes have been visited!");
        }
        Tree<T> currentNode = (Tree<T>) queue.poll();
        if (currentNode.getLeft() != null) {
            queue.add(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
            queue.add(currentNode.getRight());
        }
        return currentNode;
    }

    @Override
    public <T extends Comparable<T>> void setTree(Tree<T> tree) {
        queue.add(tree);
    }

    public static BfsStrategy getInstance() {
        return INSTANCE;
    }

}
