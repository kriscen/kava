package com.kava.designpattern.singleton;

/**
 * Program Name: kava-design
 * <p>
 * Description: 饿汉模式
 * <p>
 * Created by kris on 2021/6/6
 *
 * @author kris
 */
public class HungrySingletonDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.excute();
    }

    public static class Singleton{

        /**
         * 第一步，直接将类的示例创建出来，赋予static final修饰的变量
         */
        private static final Singleton instance = new Singleton();

        /**
         * 第二步，构造函数私有化
         */
        private Singleton(){}

        /**
         * 第三步，给一个静态方法，返回唯一的内部创建的实例
         * @return
         */
        public static Singleton getInstance(){
            return instance;
        }

        public void excute(){
            System.out.println("内部方法...");
        }

    }
}
