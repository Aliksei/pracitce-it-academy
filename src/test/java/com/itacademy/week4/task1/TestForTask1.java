package com.itacademy.week4.task1;

import com.itacademy.week4.TestDataWeek4;
import com.itcademy.common.entity.Student;
import com.itcademy.common.entity.Tree;
import com.itcademy.week4.task1.strategy.BfsStrategy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;


public class TestForTask1 {

    private Tree<Student> tree = TestDataWeek4.getTestTree();

    @Test
    public void checkIteratorModes() {
        Iterator<Tree<Student>> bfsIterator = tree.iterator(BfsStrategy.getInstance());

        Iterator<Tree<Student>> dfsIterator = tree.iterator();

        List<Tree<Student>> studentsBfs = new LinkedList<>();
        List<Tree<Student>> studentsDfs = new LinkedList<>();

        while (bfsIterator.hasNext()) {
            studentsBfs.add(bfsIterator.next());
        }

        while (dfsIterator.hasNext()) {
            studentsDfs.add(dfsIterator.next());
        }

        Assert.assertEquals(studentsBfs.size(), studentsDfs.size());

        boolean isEquals;
        boolean isDiffers = false;
        for (int i = 0; i < studentsBfs.size(); i++) {
            isEquals = studentsBfs.get(i).equals(studentsDfs.get(i));
            if (!isEquals) {
                isDiffers = true;
                break;
            }
        }
        Assert.assertTrue(isDiffers);

        boolean equalCollection = CollectionUtils.isEqualCollection(studentsBfs, studentsDfs);
        System.out.println(equalCollection);
    }
}
