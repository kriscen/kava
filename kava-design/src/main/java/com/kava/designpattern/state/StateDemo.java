package com.kava.designpattern.state;

public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context(new NewState());
        context.execute(1);
        context.execute(2);
        context.execute(3);
    }

    public interface State{

        void excute();
    }

    public static class NewState implements State{

        @Override
        public void excute() {
            System.out.println("新建");
        }
    }
    public static class ApprovingState implements State{

        @Override
        public void excute() {
            System.out.println("待审批");
        }
    }
    public static class ApprovedState implements State{

        @Override
        public void excute() {
            System.out.println("已审批");
        }
    }
    public static class FinishState implements State{

        @Override
        public void excute() {
            System.out.println("已完成");
        }
    }

    public static class Context{

        private State state;

        public Context(State state) {
            this.state = state;
            this.state.excute();
        }

        public void execute(int stateType){
             if(stateType == 1){
                this.state = new ApprovingState();
                state.excute();
            }else if(stateType == 2){
                this.state = new ApprovedState();
                state.excute();
            }else if(stateType == 3){
                this.state = new FinishState();
                state.excute();
            }
        }
    }

}
