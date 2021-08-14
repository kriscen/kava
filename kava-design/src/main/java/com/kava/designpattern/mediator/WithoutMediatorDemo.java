package com.kava.designpattern.mediator;

public class WithoutMediatorDemo {

    public static void main(String[] args) {
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();

    }

    public static class ModuleA{

        public void execute(){
            ModuleB moduleB = new ModuleB();
            ModuleC moduleC = new ModuleC();
            moduleB.execute("A");
            moduleC.execute("A");
        }

        public void execute(String invoker){
            System.out.println(invoker+"A");
        }
    }

    public static class ModuleB{
        public void execute(){
            ModuleA moduleA = new ModuleA();
            ModuleC moduleC = new ModuleC();
            moduleA.execute("B");
            moduleC.execute("B");
        }
        public void execute(String invoker){
            System.out.println(invoker+"B");

        }
    }

    public static class ModuleC{
        public void execute(){
            ModuleA moduleA = new ModuleA();
            ModuleB moduleB = new ModuleB();
            moduleA.execute("C");
            moduleB.execute("C");
        }
        public void execute(String invoker){
            System.out.println(invoker+"C");

        }
    }
}
