package com.itcademy.secondweek.task1.service;

import java.util.HashMap;
import java.util.Map;

public class BraceValidator {

    private final static Map<Integer, Integer> MAP;

    static {
        MAP = new HashMap<>();
        MAP.put(91,93);
        MAP.put(40,41);
        MAP.put(123,125);
    }

    public boolean validate(final String target) {
        char[] chars = target.toCharArray();
        return chars.length % 2 == 0 && (checkFirstCase(chars) || checkSecondCase(chars));
    }

    private static boolean checkFirstCase(final char[] arr) {
        boolean res = true;
        for (int i = 0; i < arr.length; i = i+2) {
            if (!res){
                return res;
            }
            res = res && (MAP.get(arr[i] + 0) == arr[i+1]);
        }
        return res;
    }

    private static boolean checkSecondCase(final char[] arr) {
        boolean res = true;
        for (int i = 0; i < arr.length/2; i++) {
            if (!res){
                return false;
            }
            res = res && (MAP.get(arr[i] + 0) == arr[arr.length - i - 1]);
        }
        return res;
    }

}
