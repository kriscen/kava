package com.kava.designpattern.factory.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class WithoutSimpleFactoryDemo {

    public static void main(String[] args) {
        Product product = new Product("测试产品");
        System.out.println(product);
    }

    @Data
    @AllArgsConstructor
    @ToString
    public static class Product{
        private String name;

    }
}
