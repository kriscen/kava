package com.kava.designpattern.adapter;

public class AdapterPatterDemo {

    public static void main(String[] args) {
        NewInterface oldInterface = new NewInterfaceAdapter(new OldInterfaceImpl());
        NewInterface newInterface = new NewInterfaceImpl();

        oldInterface.newExcute();
        newInterface.newExcute();
    }

    /**
     * 定义一个适配器类
     */
    public static class NewInterfaceAdapter implements NewInterface{

        private OldInterface oldInterface;

        public NewInterfaceAdapter(OldInterface oldInterface) {
            this.oldInterface = oldInterface;
        }

        @Override
        public void newExcute() {
            oldInterface.oldExcute();
        }
    }


    /**
     * 旧版本接口
     */
    public interface OldInterface{
        void oldExcute();
    }

    /**
     * 老接口实现类
     */
    public static class OldInterfaceImpl implements OldInterface {

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
    public static class NewInterfaceImpl implements NewInterface {

        @Override
        public void newExcute() {
            System.out.println("new..");
        }
    }


}
