package com.kava.designpattern.builder;

import lombok.Data;

public class WithoutBUilderDemo {

    public static void main(String[] args) {
        //构造复杂的product对象
        Product product = new Product();

        System.out.println("field1校验");
        product.setField1("1");

        System.out.println("field2转换");
        product.setField1("2");

        System.out.println("field3数据关联");
        product.setField1("3");


    }

    @Data
    public static class Product{

        private String field1;
        private String field2;
        private String field3;

    }
}
