package com.kava.designpattern.singleton;

/**
 * Program Name: kava-design
 * <p>
 * Description: 线程不安全的饱汉模式
 * <p>
 * Created by kris on 2021/6/6
 *
 * @author kris
 */
public class UnsafeFullSingletonDemo {


    /**
     * 线程不安全
     *
     */
    public static class Singleton{

        private static Singleton instance;

        private Singleton(){}

        public static Singleton getInstance(){
            /*
                线程不安全的点
             */
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }

    }

}
