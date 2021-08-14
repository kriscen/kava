package com.kava.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class WithPrototypeDemo {

    public static void main(String[] args) {
        Product product = new Product("测试产品",new Component("测试组件"));

        //手动拷贝
        Product copy = new Product(product.getName(),product.getComponent());

        System.out.println(product);
        System.out.println(copy);
    }

    @Data
    @AllArgsConstructor
    @ToString
    public static class Component{
        private String name;
    }

    @Data
    @AllArgsConstructor
    @ToString
    public static class Product{
       private String name;
       private Component component;
    }



}
