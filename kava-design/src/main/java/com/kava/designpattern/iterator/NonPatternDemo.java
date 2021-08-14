package com.kava.designpattern.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Program Name: kava-design
 * <p>
 * Description: 不使用设计模式
 * <p>
 * Created by kris on 2021/6/3
 *
 * @author kris
 */
public class NonPatternDemo {

    public static void main(String[] args) {
        Student s1 = new Student("小明");
        Student s2 = new Student("小王");

//        Student[] students = new Student[2];
//        students[0] = s1;
//        students[1] = s2;
        Map<String,Student> students = new HashMap<>();
        students.put(s1.getName(),s1);
        students.put(s2.getName(),s2);

        Classroom classroom = new Classroom();
        classroom.setStudents(students);

        Map<String, Student> resultStudent = classroom.getStudents();
        for (Student student : resultStudent.values()) {
            System.out.println(student.getName());
        }

    }

    /**
     * 学生类
     */
    @Data
    @AllArgsConstructor
    public static class Student{
        private String name;
    }

    /**
     * 教师类
     */
    @Data
    public static class Classroom{
//        private Student[] students;
        private Map<String,Student> students;
    }

}
