package com.itcademy.week4.task2.visitor;

import com.itcademy.common.entity.Tree;
import com.itcademy.common.entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudentAgeVisitor implements TreeVisitor<Student> {

    private List<Double> ages = new ArrayList<>();

    public double getMaxAge() {
        return Collections.max(ages);
    }

    public double getMinAge() {
        return Collections.min(ages);
    }

    @Override
    public void visit(Tree<Student> treeNode) {
        ages.add(treeNode.getValue().getAge());
    }
}
