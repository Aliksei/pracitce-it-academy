package com.itcademy.week4.task2;

import com.itcademy.common.entity.Tree;
import com.itcademy.week4.task2.decorator.TreeDecorator;
import com.itcademy.week4.task2.visitor.TreeVisitor;
import java.util.Iterator;
import java.util.List;

public class Service {

    public static <T extends Comparable<T>> void traversTree(final Iterator<Tree<T>> iterator, List<TreeVisitor<T>> visitors) {
        while (iterator.hasNext()) {
            Tree<T> currentNode = iterator.next();
            TreeDecorator<T> decorated = new TreeDecorator<>(currentNode);
            visitors.forEach(decorated::accept);
        }
    }
}
