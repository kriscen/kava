package com.kava.designpattern.adapter;

public class WithoutAdapterPatterDemo {

    /**
     * 旧版本接口
     */
    public interface OldInterface{
        void oldExcute();
    }

    /**
     * 老接口实现类
     */
    public static class OldInterfaceImpl implements OldInterface{

        @Override
        public void oldExcute() {
            System.out.println("old..");
        }
    }

    /**
     * 新版本接口
     */
    public interface NewInterface{
        void newExcute();
    }

    /**
     * 新接口实现类
     */
    public static class NewInterfaceImpl implements NewInterface{

        @Override
        public void newExcute() {
            System.out.println("new..");
        }
    }

    public static void main(String[] args) {
        OldInterface oldInterface = new OldInterfaceImpl();
        NewInterface newInterface = new NewInterfaceImpl();
        oldInterface.oldExcute();
        newInterface.newExcute();
    }
}
