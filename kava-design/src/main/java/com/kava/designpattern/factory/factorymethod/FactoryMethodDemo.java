package com.kava.designpattern.factory.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        Product p1 = Product1Factory.getInstance().createProduct();
        Product p2 = Product2Factory.getInstance().createProduct();
        Product p3 = Product3Factory.getInstance().createProduct();

        p1.excute();
        p2.excute();
        p3.excute();
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

    public static abstract class AbstractProductFactory{

        public Product createProduct(){
            commonCreate();
            return specificCreate();
        }

        private void commonCreate(){
            System.out.println("通用逻辑");
        }

        protected abstract Product specificCreate();
    }

    public static class Product1Factory extends AbstractProductFactory{

        private Product1Factory(){}

        private static final Product1Factory instance = new Product1Factory();

        @Override
        protected Product specificCreate() {
            System.out.println("p1 特殊逻辑");
            return new Product1();
        }

        public static Product1Factory getInstance(){
            return instance;
        }
    }
    public static class Product2Factory extends AbstractProductFactory{

        private Product2Factory(){}

        private static final Product2Factory instance = new Product2Factory();

        @Override
        protected Product specificCreate() {
            System.out.println("p2 特殊逻辑");
            return new Product2();
        }

        public static Product2Factory getInstance(){
            return instance;
        }
    }
    public static class Product3Factory extends AbstractProductFactory{

        private Product3Factory(){}

        private static final Product3Factory instance = new Product3Factory();

        @Override
        protected Product specificCreate() {
            System.out.println("p3 特殊逻辑");
            return new Product3();
        }
        public static Product3Factory getInstance(){
            return instance;
        }
    }
}
