package com.kava.designpattern.chain;

public class ChainDemo {
    public static void main(String[] args) {
        //业务1
        Handler handler3 = new Handle3(null);
        Handler handler2 = new Handle2(handler3);
        Handler handler1 = new Handle1(handler2);
        handler1.excute();

        //业务2
        Handler h2 = new Handle2(null);
        Handler h1 = new Handle1(h2);
        Handler h3 = new Handle3(h1);
        h3.excute();
    }

    public static abstract class Handler{
        protected Handler successor;

        public Handler(Handler successor) {
            this.successor = successor;
        }

        public abstract void excute();
    }

    public static class Handle1 extends Handler{

        public Handle1(Handler successor) {
            super(successor);
        }

        @Override
        public void excute() {
            System.out.println("执行功能1");
            if(successor!=null){
                successor.excute();
            }
        }
    }
    public static class Handle2 extends Handler{

        public Handle2(Handler successor) {
            super(successor);
        }

        @Override
        public void excute() {
            System.out.println("执行功能2");
            if(successor!=null){
                successor.excute();
            }
        }
    }
    public static class Handle3 extends Handler{

        public Handle3(Handler successor) {
            super(successor);
        }

        @Override
        public void excute() {
            System.out.println("执行功能3");
            if(successor!=null){
                successor.excute();
            }
        }
    }
}
