package com.kava.designpattern.observer;

import lombok.AllArgsConstructor;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject(0);
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);

        subject.setState(1);
        subject.setState(2);

    }

    @AllArgsConstructor
    public static class Subject extends Observable {
        private Integer state;

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
            this.setChanged();
//            this.notifyObservers(state);
            this.notifyObservers();
        }
    }

    public static class ConcreteObserver implements Observer{

        @Override
        public void update(Observable o, Object arg) {
//            Integer state = (Integer)arg;
            Subject subject = (Subject)o;
            System.out.println("state:"+subject.getState());

        }
    }

}
