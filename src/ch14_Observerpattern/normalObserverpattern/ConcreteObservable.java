package ch14_Observerpattern.normalObserverpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable extends Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifys() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
