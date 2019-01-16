package com.itacademy.week3;

import com.itcademy.common.entity.TreeNode;

public class TestDataWeek3 {

    public static final TreeNode<Integer> TEST_TREE = new TreeNode<>(40);
    public static final TreeNode<String> TEST_STING_TREE = new TreeNode<>("J");

    static {
        TEST_TREE.insert(20);
        TEST_TREE.insert(30);
        TEST_TREE.insert(50);
        TEST_TREE.insert(55);
        TEST_TREE.insert(53);
        TEST_TREE.insert(18);
        TEST_TREE.insert(31);
        TEST_TREE.insert(28);


        TEST_STING_TREE.insert("K");
        TEST_STING_TREE.insert("F");
        TEST_STING_TREE.insert("E");
        TEST_STING_TREE.insert("R");
        TEST_STING_TREE.insert("N");
        TEST_STING_TREE.insert("O");
        TEST_STING_TREE.insert("U");
        TEST_STING_TREE.insert("S");
        TEST_STING_TREE.insert("Q");
        TEST_STING_TREE.insert("A");
    }

}
