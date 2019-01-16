package com.itcademy.week4.task1.strategy;

import com.itcademy.common.entity.Tree;

public interface TraversStrategy {

    boolean isEmpty();

    <T extends Comparable<T>> Tree<T> getNext(Class<T> clazz);

    <T extends Comparable<T>> void setTree(Tree<T> tree);
}
