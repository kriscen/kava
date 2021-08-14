package com.kava.designpattern.singleton;

public class SafeFullSingletonDemo {

    public static class Singleton{

        private static Singleton instance;

        private Singleton(){}

        public static Singleton getInstance(){
            if(instance == null){
                synchronized (SafeFullSingletonDemo.class){
                    instance = new Singleton();
                }
            }
            return instance;
        }
    }
}
