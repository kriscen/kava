package com.kava.designpattern.command;

import lombok.Setter;

public class CommandDemo {

    public static void main(String[] args) {
        CommandA commandA = new CommandA();
        CommandB commandB = new CommandB();

        Invoker invoker = new Invoker();

        invoker.setCommand(commandA);
        invoker.excute();

        invoker.setCommand(commandB);
        invoker.excute();
    }

    public interface Command{
        void excute();
    }


    public static class CommandA implements Command{

        @Override
        public void excute() {
            System.out.println("命令A的功能逻辑");
        }
    }
    public static class CommandB implements Command{

        @Override
        public void excute() {
            System.out.println("命令B的功能逻辑");
        }
    }

    public static class Invoker{
        @Setter
        private Command command;

        public void excute(){
            command.excute();
        }
    }

}
