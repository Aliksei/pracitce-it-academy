package com.itacademy.week4;

import com.itcademy.common.entity.Student;
import com.itcademy.common.entity.Tree;
import com.itcademy.common.entity.TreeNode;

public class TestDataWeek4 {

    private static Tree<Student> tree;

    static {
        Student student1 = Student.of(12321, 1, 10, 26d, "vasia");
        Student student2 = Student.of(4324, 1, 8, 22d, "petasdasdsadasdasdia");
        Student student3 = Student.of(12321, 3, 7, 23d, "oleg");
        Student student4 = Student.of(5654, 4, 4, 19d, "andrei");
        Student student5 = Student.of(577, 5, 8, 20.42d, "antasdon");
        Student student6 = Student.of(43, 3, 9, 24d, "lasdsaesha");
        Student student7 = Student.of(234, 2, 6, 19.5d, "denis");

        tree = new TreeNode<>(student1);
        tree.insert(student2);
        tree.insert(student3);
        tree.insert(student4);
        tree.insert(student5);
        tree.insert(student6);
        tree.insert(student7);
    }

    public static Tree<Student> getTestTree() {
        return tree;
    }
}
