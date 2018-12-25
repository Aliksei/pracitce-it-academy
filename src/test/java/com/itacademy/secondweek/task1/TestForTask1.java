package com.itacademy.secondweek.task1;

import com.itcademy.secondweek.task1.service.BraceValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestForTask1 {

    private final BraceValidator validator = new BraceValidator();

    @Test
    public void positiveCheck() {
        boolean case1 = validator.validate("[]{}()");
        assertTrue(case1);

        boolean case2 = validator.validate("[({})]");
        assertTrue(case2);
    }

    @Test
    public void negativeCheck() {
        boolean result = validator.validate("[]}()");
        assertFalse(result);
    }
}
