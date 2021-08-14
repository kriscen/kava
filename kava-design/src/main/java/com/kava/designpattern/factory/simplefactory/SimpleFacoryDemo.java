package com.kava.designpattern.factory.simplefactory;

public class SimpleFacoryDemo {

    public static void main(String[] args) {
        Product product = ProductFactory.create();
        product.excute();
    }

    public interface Product{
        void excute();
    }

    public static class ProductImpl1 implements Product{
        @Override
        public void excute() {
            System.out.println("product1 impl");
        }
    }

    public static class ProductFactory{
        public static Product create(){
            return new ProductImpl1();
        }
    }
}

