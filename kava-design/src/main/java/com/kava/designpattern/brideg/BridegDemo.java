package com.kava.designpattern.brideg;

public class BridegDemo {

    public static void main(String[] args) {

        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.execute();

    }

    public interface Implementor{
        void execute();
    }

    public static class ConcreteImplementor implements Implementor{

        @Override
        public void execute() {
            System.out.println("执行了功能逻辑");
        }
    }

    public static abstract class Abstraction{
        protected Implementor implementor;

        public Abstraction(Implementor implementor) {
            this.implementor = implementor;
        }

        public abstract void execute();
    }

    public static class RefinedAbstraction extends Abstraction{

        public RefinedAbstraction(Implementor implementor) {
            super(implementor);
        }

        @Override
        public void execute() {
            implementor.execute();
        }
    }

}
