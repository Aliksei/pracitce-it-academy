package com.itcademy.week4.task2.visitor;

import com.itcademy.common.entity.Tree;
import com.itcademy.common.entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMarksVisitor implements TreeVisitor<Student> {

    private List<Integer> marks = new ArrayList<>();

    public double getAverage() {
        return marks.stream()
                .collect(Collectors.averagingDouble(Double::valueOf));
    }

    public int getMaxMark() {
        return Collections.max(marks);
    }

    public int getMinMark() {
        return Collections.min(marks);
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public void visit(Tree<Student> treeNode) {
        marks.add(treeNode.getValue().getMark());
    }

}
