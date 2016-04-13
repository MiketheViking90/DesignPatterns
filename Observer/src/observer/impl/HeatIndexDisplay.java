package observer.impl;

import observer.DisplayElement;
import observer.Observer;
import subject.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private static final String DISPLAY_FORMAT = "Heat index is %1.4f";

    private double heatIndex;
    private Subject subject;

    public HeatIndexDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.heatIndex = temp + humidity;
        display();
    }

    @Override
    public void display() {
        String msg = String.format(DISPLAY_FORMAT, heatIndex);
        System.out.println(msg);
    }
}
