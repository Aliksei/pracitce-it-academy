package com.itcademy.week4.task2.decorator;

import com.itcademy.common.entity.Tree;
import com.itcademy.week4.task1.strategy.TraversStrategy;
import com.itcademy.week4.task2.visitor.TreeVisitor;
import java.util.Iterator;

public class TreeDecorator<T extends Comparable<T>> implements Tree<T> {

    protected Tree<T> tree;

    public TreeDecorator(final Tree<T> tree) {
        this.tree = tree;
    }

    public void accept(final TreeVisitor<T> visitor) {
        visitor.visit(tree);
    }


    @Override
    public Iterator<Tree<T>> iterator(TraversStrategy strategy) {
        return tree.iterator(strategy);
    }

    @Override
    public Tree<T> getRight() {
        return tree.getRight();
    }

    @Override
    public Tree<T> getLeft() {
        return tree.getLeft();
    }

    @Override
    public void insert(T value) {
        tree.insert(value);
    }

    @Override
    public T getValue() {
        return tree.getValue();
    }

    @Override
    public Iterator<Tree<T>> iterator() {
        return tree.iterator();
    }
}
