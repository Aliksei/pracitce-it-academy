package com.itcademy.week4.task2.visitor;

import com.itcademy.common.entity.Tree;

public class PrinterVisitor<T extends Comparable<T>> implements TreeVisitor<T> {

    @Override
    public void visit(Tree<T> treeNode) {
        System.out.println(treeNode.getValue());
    }
}
