package com.itacademy.week4.task2;

import com.itacademy.week4.TestDataWeek4;
import com.itcademy.common.entity.Student;
import com.itcademy.common.entity.Tree;
import com.itcademy.week4.task2.Service;
import com.itcademy.week4.task2.visitor.PrinterVisitor;
import com.itcademy.week4.task2.visitor.StudentAgeVisitor;
import com.itcademy.week4.task2.visitor.StudentMarksVisitor;
import com.itcademy.week4.task2.visitor.TreeVisitor;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestForTask2 {

    private Tree<Student> tree = TestDataWeek4.getTestTree();

    @Test
    public void checkVisitors() {
        List<TreeVisitor<Student>> treeVisitors = new ArrayList<>();
        treeVisitors.add(new PrinterVisitor<>());
        treeVisitors.add(new StudentAgeVisitor());
        treeVisitors.add(new StudentMarksVisitor());

        Service.traversTree(tree.iterator(), treeVisitors);

        StudentAgeVisitor studentAgeVisitor = ((StudentAgeVisitor) treeVisitors.get(1));

        Assert.assertEquals(19.0d, studentAgeVisitor.getMinAge(), 0);
        Assert.assertEquals(26.0d, studentAgeVisitor.getMaxAge(), 0);

        StudentMarksVisitor studentMarksVisitor = ((StudentMarksVisitor) treeVisitors.get(2));

        Assert.assertEquals(10, studentMarksVisitor.getMaxMark());
        Assert.assertEquals(4, studentMarksVisitor.getMinMark());
        Assert.assertEquals(7.428571428571429d, studentMarksVisitor.getAverage(), 0);
    }

}
