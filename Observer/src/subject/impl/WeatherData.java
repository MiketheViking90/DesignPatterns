package subject.impl;

import java.util.HashSet;
import java.util.Set;

import observer.Observer;
import subject.Subject;

public class WeatherData implements Subject {

    private Set<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new HashSet<>();
    }

    @Override
    public void register(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void update() {
        for (Observer obs : observers) {
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        update();
    }

    public void setMeasurements(double t, double h, double p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        measurementsChanged();
    }

}
