package com.kava.designpattern.facade;

public class WithoutFacadeDemo {

    public static void main(String[] args) {
        //假设这边是子系统2，需要调用系统A的三个模块
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();
    }

    public static class ModuleA{
        public void execute(){
            System.out.println("子系统1的模块A的功能");
        }
    }

    public static class ModuleB{
        public void execute(){
            System.out.println("子系统1的模块B的功能");
        }
    }

    public static class ModuleC{
        public void execute(){
            System.out.println("子系统1的模块C的功能");
        }
    }
}
