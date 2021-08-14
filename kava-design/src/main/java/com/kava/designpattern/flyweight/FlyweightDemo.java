package com.kava.designpattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class FlyweightDemo {

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.get("对象1");
        flyweight1.excute();

        Flyweight flyweight2 = FlyweightFactory.get("对象1");
        flyweight2.excute();

        System.out.println(flyweight1.equals(flyweight2));
    }

    public interface Flyweight{
        void excute();
    }

    @Data
    @AllArgsConstructor
    public static class ConcreteFlyweight implements Flyweight{

        private String name;

        @Override
        public void excute() {

        }
    }

    public static class FlyweightFactory{
        private static Map<String,Flyweight> cachePool = new HashMap<>();

        public static Flyweight get(String name){
            Flyweight flyweight = cachePool.get(name);
            if(flyweight == null){
                flyweight = new ConcreteFlyweight(name);
                cachePool.put(name,flyweight);
            }
            return flyweight;
        }

    }
}
