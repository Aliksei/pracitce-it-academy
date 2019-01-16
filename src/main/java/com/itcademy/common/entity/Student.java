package com.itcademy.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Student implements Comparable<Student> {

    private Integer id;

    private Integer course;

    private Integer mark;

    private Double age;

    private String name;

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }
}
