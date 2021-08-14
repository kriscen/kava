package com.kava.designpattern.mediator;

import lombok.Data;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        ModuleA moduleA = new ModuleA(mediator);
        ModuleB moduleB = new ModuleB(mediator);
        ModuleC moduleC = new ModuleC(mediator);

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();

    }
    @Data
    public static class Mediator{
        private ModuleA moduleA;
        private ModuleB moduleB;
        private ModuleC moduleC;

        public void moduleAInvoke(){
            moduleB.execute("A");
            moduleC.execute("A");
        }

        public void moduleBInvoke(){
            moduleA.execute("B");
            moduleC.execute("B");
        }

        public void moduleCInvoke(){
            moduleA.execute("C");
            moduleB.execute("C");
        }
    }

    public static class ModuleA{

        private Mediator mediator;

        public ModuleA(Mediator mediator) {
            this.mediator = mediator;
            this.mediator.setModuleA(this);
        }

        public void execute(){
            mediator.moduleAInvoke();
        }

        public void execute(String invoker){
            System.out.println(invoker+"A");
        }
    }

    public static class ModuleB{

        private Mediator mediator;

        public ModuleB(Mediator mediator) {
            this.mediator = mediator;
            this.mediator.setModuleB(this);
        }

        public void execute(){
            mediator.moduleBInvoke();
        }
        public void execute(String invoker){
            System.out.println(invoker+"B");

        }
    }

    public static class ModuleC{

        private Mediator mediator;

        public ModuleC(Mediator mediator) {
            this.mediator = mediator;
            this.mediator.setModuleC(this);
        }

        public void execute(){
            mediator.moduleCInvoke();
        }
        public void execute(String invoker){
            System.out.println(invoker+"C");

        }
    }
}
