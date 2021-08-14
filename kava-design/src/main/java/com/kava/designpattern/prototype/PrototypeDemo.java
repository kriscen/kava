package com.kava.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class PrototypeDemo {

    public static void main(String[] args) {
        Product product = new Product("测试产品",new Component("测试组件"));
        try {
            Product clone = (Product)product.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Data
    @AllArgsConstructor
    @ToString
    public static class Component{
        private String name;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new Component(getName());
        }
    }

    @Data
    @AllArgsConstructor
    @ToString
    public static class Product{
        private String name;
        private Component component;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            /*
                浅拷贝:对当前对象属性进行一个拷贝，共用一个对象
             */
//            return new Product(getName(),getComponent());

            /*
                深拷贝：持有对象也创建一个新的对象
             */
            return new Product(getName(),(Component) getComponent().clone());
        }
    }
}
