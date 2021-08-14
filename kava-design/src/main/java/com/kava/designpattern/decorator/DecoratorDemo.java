package com.kava.designpattern.decorator;

public class DecoratorDemo {

    public interface Component{
        void excute();
    }

    public static class ConcreteComponent implements Component{

        @Override
        public void excute() {
            System.out.println("基础功能");
        }
    }

    public static class Decorator implements Component{

        private Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void excute() {
            System.out.println("执行前，部分增强");
            component.excute();
            System.out.println("执行后，部分增强");
        }
    }

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new Decorator(component);
        decorator.excute();
    }

}
