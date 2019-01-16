package com.itcademy.week4.task2.visitor;

import com.itcademy.common.entity.Tree;

public interface TreeVisitor<T extends Comparable<T>> extends Visitor<Tree<T>> {

    @Override
    void visit(Tree<T> treeNode);
}
