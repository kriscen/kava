package com.kava.designpattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StrategyDemo {

    public static void main(String[] args) {
        int discountStyle = 2;
        DiscountCalculatorStrategy strategy = DiscountCalculatorStrategyFactory.getDiscountCalculatorStrategy(discountStyle);

        Context context = new Context(strategy);
        context.calculate();
    }
    public interface DiscountCalculatorStrategy{
        void calculator();
    }

    public static class DiscountCalculatorStrategyA implements DiscountCalculatorStrategy{

        @Override
        public void calculator() {
            System.out.println("a");
        }
    }
    public static class DiscountCalculatorStrategyB implements DiscountCalculatorStrategy{

        @Override
        public void calculator() {
            System.out.println("b");
        }
    }
    public static class DiscountCalculatorStrategyC implements DiscountCalculatorStrategy{

        @Override
        public void calculator() {
            System.out.println("c");
        }
    }
    public static class DiscountCalculatorStrategyDefault implements DiscountCalculatorStrategy{

        @Override
        public void calculator() {
            System.out.println("default");
        }
    }

    public static class DiscountCalculatorStrategyFactory{
        public static DiscountCalculatorStrategy getDiscountCalculatorStrategy(int discountStyle){
            if(discountStyle == 1){
                return new DiscountCalculatorStrategyA();
            }else if(discountStyle == 2){
                return new DiscountCalculatorStrategyB();
            }else if(discountStyle == 3){
                return new DiscountCalculatorStrategyC();
            }else {
                return new DiscountCalculatorStrategyDefault();
            }
        }
    }

    @Data
    @AllArgsConstructor
    public static class Context{
        private DiscountCalculatorStrategy strategy;

        public void calculate(){
            strategy.calculator();
        }
    }
}
