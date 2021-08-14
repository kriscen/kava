package com.kava.designpattern.templatemethod;

/**
 * Program Name: kava-design
 * <p>
 * Description: 不使用模式
 * <p>
 * Created by kris on 2021/6/3
 *
 * @author kris
 */
public class WithoutTemplateMethodDemo {

    public static void main(String[] args) {
        DiscountCalculator1 calculator1 = new DiscountCalculator1();
        calculator1.calculate();

        DiscountCalculator2 calculator2 = new DiscountCalculator2();
        calculator2.calculate();

        DiscountCalculator3 calculator3 = new DiscountCalculator3();
        calculator3.calculate();
    }

    public static class DiscountCalculator1{
        public void calculate(){
            System.out.println("通用的计算逻辑");
            System.out.println("优惠计算器1的特殊计算逻辑");
        }
    }
    public static class DiscountCalculator2{
        public void calculate(){
            System.out.println("通用的计算逻辑");
            System.out.println("优惠计算器2的特殊计算逻辑");
        }
    }
    public static class DiscountCalculator3{
        public void calculate(){
            System.out.println("通用的计算逻辑");
            System.out.println("优惠计算器3的特殊计算逻辑");
        }
    }

}
