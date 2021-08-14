package com.kava.designpattern.strategy;

public class WithoutStrategyDemo {

    public static void main(String[] args) {
        //根据discountStyle
        int discountStyle = 1;

        if(discountStyle == 1){
            System.out.println("优惠1");
        }else if(discountStyle == 2){
            System.out.println("优惠2");
        }else if(discountStyle == 3){
            System.out.println("优惠3");
        }else {
            System.out.println("默认");
        }
    }
}
