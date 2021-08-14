package com.kava.designpattern.factory.AbstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        //A1+B1
        ProductA a1 = Factory1.getInstance().createProductA();
        ProductB b1 = Factory1.getInstance().createProductB();

        a1.excute();
        b1.excute();
        //A2+B2
        ProductA a2 = Factory2.getInstance().createProductA();
        ProductB b2 = Factory2.getInstance().createProductB();

        a2.excute();
        b2.excute();

    }

    public interface ProductA{
        void excute();
    }
    public static class ProductA1 implements ProductA {
        @Override
        public void excute() {
            System.out.println("pA1..");
        }
    }
    public static class ProductA2 implements ProductA {
        @Override
        public void excute() {
            System.out.println("pA2..");
        }
    }
    public static class ProductA3 implements ProductA {
        @Override
        public void excute() {
            System.out.println("pA3..");
        }
    }


    public interface ProductB{
        void excute();
    }
    public static class ProductB1 implements ProductB {
        @Override
        public void excute() {
            System.out.println("pB1..");
        }
    }
    public static class ProductB2 implements ProductB {
        @Override
        public void excute() {
            System.out.println("pB2..");
        }
    }
    public static class ProductB3 implements ProductB {
        @Override
        public void excute() {
            System.out.println("pB3..");
        }
    }

    public interface Factory{
        ProductA createProductA();
        ProductB createProductB();

    }

    public static class Factory1 implements Factory{

        private Factory1(){
        }

        private static final Factory1 instance = new Factory1();

        public static Factory getInstance(){
            return instance;
        }

        @Override
        public ProductA createProductA() {
            return new ProductA1();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB1();
        }
    }

    public static class Factory2 implements Factory{
        private Factory2(){
        }

        private static final Factory2 instance = new Factory2();

        public static Factory getInstance(){
            return instance;
        }
        @Override
        public ProductA createProductA() {
            return new ProductA2();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB2();
        }
    }

    public static class Factory3 implements Factory{
        private Factory3(){
        }

        private static final Factory3 instance = new Factory3();

        public static Factory getInstance(){
            return instance;
        }
        @Override
        public ProductA createProductA() {
            return new ProductA3();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB3();
        }
    }
}
