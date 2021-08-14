package com.kava.designpattern.proxy;

import lombok.AllArgsConstructor;

public class ProxyDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }

    public interface Subject{
        void request();
    }

    public static class ConcreteSubject implements Subject{

        @Override
        public void request() {
            System.out.println("执行请求");
        }
    }

    @AllArgsConstructor
    public static class Proxy implements Subject{

        private Subject subject;

        @Override
        public void request() {
            System.out.println("执行额外的条件判断，考虑是否执行subject的request方法");
            boolean invoke = true;
            if(invoke){
                subject.request();
            }
        }
    }
}
