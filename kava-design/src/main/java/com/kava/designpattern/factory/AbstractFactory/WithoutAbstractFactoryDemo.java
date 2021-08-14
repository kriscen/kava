package com.kava.designpattern.factory.AbstractFactory;

public class WithoutAbstractFactoryDemo {

    public static void main(String[] args) {
        //创建1+2组合
        Product product1 = Product1Factory.createProduct();
        Product product2 = Product2Factory.createProduct();

        product1.excute();
        product2.excute();
    }

    public interface Product{
        void excute();
    }
    public static class Product1 implements Product {
        @Override
        public void excute() {
            System.out.println("p1..");
        }
    }
    public static class Product2 implements Product {
        @Override
        public void excute() {
            System.out.println("p2..");
        }
    }
    public static class Product3 implements Product {
        @Override
        public void excute() {
            System.out.println("p3..");
        }
    }

    public static class Product1Factory{
        public static Product createProduct(){
            return new Product1();
        }
    }
    public static class Product2Factory{
        public static Product createProduct(){
            return new Product2();
        }
    }
    public static class Product3Factory{
        public static Product createProduct(){
            return new Product3();
        }
    }
}
