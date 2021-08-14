package com.kava.designpattern.singleton;

public class InnerClassFullSingletonDemo {
    /**
     * 可以做饱汉模式
     * 内部类，只要没有被使用，就不会初始化，singleton的实例就不会创建
     * 第一次有人调用getInstance的时候，内部类会初始化，创建一个singleton的实例
     * 然后java能确保，类静态初始化的过程一定只会执行一次
     */
    public static class Singleton{

        private Singleton(){}

        public static class InnerHolder{
            public static final Singleton instance = new Singleton();
        }

        public static Singleton getInstance(){
            return InnerHolder.instance;
        }
    }

}
