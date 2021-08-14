package com.kava.designpattern.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: kava-design
 * <p>
 * Description: Iterator
 * <p>
 * Created by kris on 2021/6/3
 *
 * @author kris
 */
public class IteratorDemo {

    /**
     * 定义一个自己的迭代器
     */
    public interface Iterator {
        boolean hasNext();
        Object next();
    }

    /**
     * 代表了集合类
     */
    public interface Aggregate {
        Iterator iterator();
    }

    @AllArgsConstructor
    public static class Student {
        @Getter
        private String name;
    }

    /**
     * 教室迭代器
     */
    public static class ClassroomIterator implements Iterator {

        private Classroom classroom;
        private int index;

        public ClassroomIterator(Classroom classroom) {
            this.classroom = classroom;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if(index < classroom.getLength()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            Student student = classroom.getStudent(index);
            index++;
            return student;
        }

    }



    public static class Classroom implements Aggregate {

//        private Student[] students;
        private List<Student> students;
        private int last = 0;

        public Classroom(int size) {
//            this.students = new Student[size];
            this.students = new ArrayList<>(2);
        }

        public Student getStudent(int index) {
            return students.get(index);
        }

        public void addStudent(Student student) {
            students.add(student);
            last++;
        }

        public int getLength() {
            return last;
        }

        /**
         * 返回一个教室迭代器，其中封装了教室自己，让迭代器可以获取教室中的数据
         * @return
         */
        @Override
        public Iterator iterator() {
            return new ClassroomIterator(this);
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student("小明");
        Student s2 = new Student("小王");

        Classroom classroom = new Classroom(2);
        classroom.addStudent(s1);
        classroom.addStudent(s2);

        Iterator iterator = classroom.iterator();
        while (iterator.hasNext()){
            Student student = (Student)iterator.next();
            System.out.println(student.getName());
        }
    }
}
