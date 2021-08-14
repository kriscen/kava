package com.kava.designpattern.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        //假设这边是子系统2
        SystemFacade facade = new SystemFacade();
        facade.execute();
    }

    /**
     * 子系统1的门面类
     */
    public static class SystemFacade{
        public void execute(){
            //子系统1，封装了自己的多个模块,ABC，基于自己多个模块的功能对外统一暴露出去一个功能
            ModuleA moduleA = new ModuleA();
            ModuleB moduleB = new ModuleB();
            ModuleC moduleC = new ModuleC();

            moduleA.execute();
            moduleB.execute();
            moduleC.execute();
        }

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
