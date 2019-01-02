package com.itcademy.week2.task4.service;

import java.util.List;

public class ArrSorter {

    public void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) % 2 != 0 && list.get(i) > list.get(j)) {
                        int a = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, a);
                    }
                }
            }
        }
    }

}
