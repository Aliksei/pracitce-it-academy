package com.itcademy.common.entity;

import com.itcademy.week4.task1.strategy.TraversStrategy;
import java.util.Iterator;

public interface Tree<T extends Comparable<T>> extends Iterable<Tree<T>> {

    Tree<T> getRight();

    Tree<T> getLeft();

    void insert(T value);

    T getValue();

    Iterator<Tree<T>> iterator(final TraversStrategy strategy);

}
