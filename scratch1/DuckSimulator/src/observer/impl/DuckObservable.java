package observer.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import observer.QuackObservable;
import observer.QuackObserver;

public class DuckObservable implements QuackObservable {

    @Getter List<QuackObserver> observers;
    QuackObservable duck;

    public DuckObservable(QuackObservable duck) {
        observers = new ArrayList<>();
        this.duck = duck;
    }


    @Override
    public void notifyObservers() {
        for (QuackObserver obs : observers) {
            obs.update(duck);
        }
    }

    @Override
    public void registerObserver(QuackObserver obs) {
        observers.add(obs);
    }

}
