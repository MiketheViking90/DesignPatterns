package subject.impl;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import subject.Subject;

public class Newspaper implements Subject {

    private String content;
    private List<Observer> observers;

    public Newspaper() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update() {
        for (Observer obs : observers) {
            obs.update(content);
        }
    }

}
