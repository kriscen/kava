package com.kava.designpattern.factory.factorymethod;

public class WithoutFactoryMethodDemo {

    public static void main(String[] args) {
        Product p1 = Product1Factory.createProduct();
        Product p2 = Product2Factory.createProduct();
        Product p3 = Product3Factory.createProduct();

        p1.excute();
        p2.excute();
        p3.excute();
    }

    public interface Product{
        void excute();
    }

    public static class Product1 implements Product{
        @Override
        public void excute() {
            System.out.println("p1..");
        }
    }
    public static class Product2 implements Product{
        @Override
        public void excute() {
            System.out.println("p2..");
        }
    }
    public static class Product3 implements Product{
        @Override
        public void excute() {
            System.out.println("p3..");
        }
    }

    public static class Product1Factory{
        public static Product createProduct(){
            System.out.println("通用逻辑");
            System.out.println("p1 特殊逻辑");
            return new Product1();
        }
    }
    public static class Product2Factory{
        public static Product createProduct(){
            System.out.println("通用逻辑");
            System.out.println("p2 特殊逻辑");
            return new Product2();
        }
    }
    public static class Product3Factory{
        public static Product createProduct(){
            System.out.println("通用逻辑");
            System.out.println("p3 特殊逻辑");
            return new Product3();
        }
    }
}
