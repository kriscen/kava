package com.kava.designpattern.chain;

public class WithoutChainDemo {
    public static void main(String[] args) {
        //业务1
        System.out.println("功能1");
        System.out.println("功能2");
        System.out.println("功能3");
        //业务2
        System.out.println("功能3");
        System.out.println("功能1");
        System.out.println("功能2");
    }
}
