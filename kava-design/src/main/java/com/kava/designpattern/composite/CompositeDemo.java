package com.kava.designpattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Department leafDept1 = new Department("叶子部门1");
        Department leafDept2 = new Department("叶子部门2");
        Department leafDept3 = new Department("叶子部门3");

        Department subDept1 = new Department("子部门1");
        Department subDept2 = new Department("子部门2");

        subDept1.getChildren().add(leafDept1);
        subDept1.getChildren().add(leafDept2);

        subDept2.getChildren().add(leafDept3);

        Department parentDept = new Department("父部门");
        parentDept.getChildren().add(subDept1);
        parentDept.getChildren().add(subDept2);


        parentDept.remove();

    }

    @Data
    public static class Department{
        public Department(String name) {
            this.name = name;
        }

        private String name;
        private List<Department> children = new ArrayList<>();

        public void remove(){
            if(children.size()>0){
                for (Department child : children) {
                    child.remove();
                }
            }
            System.out.println("删除部门:"+name);
        }
    }
}
