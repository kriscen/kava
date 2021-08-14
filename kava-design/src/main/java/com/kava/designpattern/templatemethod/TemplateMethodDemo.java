package com.kava.designpattern.templatemethod;

/**
 * Program Name: kava-design
 * <p>
 * Description: 使用了模板方法模式
 * <p>
 * Created by kris on 2021/6/3
 *
 * @author kris
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        DiscountCalculator calculator1 = new DiscountCalculator1();
        calculator1.calculate();
        DiscountCalculator calculator2 = new DiscountCalculator2();
        calculator2.calculate();
        DiscountCalculator calculator3 = new DiscountCalculator3();
        calculator3.calculate();
    }

    public interface DiscountCalculator{
        void calculate();
    }

    public static abstract class AbstractDiscountCalculator implements DiscountCalculator{
        @Override
        public void calculate(){
            //先完成通用的计算
            commonCalculate();
            //后计算特殊
            specificCalculate();
        }

        private void commonCalculate(){
            System.out.println("通用计算逻辑");
        }

        protected abstract void specificCalculate();
    }

    public static class DiscountCalculator1 extends AbstractDiscountCalculator{
        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器1的特殊计算逻辑");
        }
    }
    public static class DiscountCalculator2 extends AbstractDiscountCalculator{
        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器2的特殊计算逻辑");
        }
    }
    public static class DiscountCalculator3  extends AbstractDiscountCalculator{
        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器3的特殊计算逻辑");
        }
    }

}
