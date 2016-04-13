package observer.impl;

import observer.DisplayElement;
import observer.Observer;
import subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private static final String CURRENT_CONDITIONS_DISPLAY_FORMAT = "Current conditions are"
            + " %1.2f degrees and"
            + " %1.2f humidity";

    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject subject) {
        this.weatherData = subject;
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        String message = String.format(CURRENT_CONDITIONS_DISPLAY_FORMAT,
                this.temperature,
                this.humidity);
        System.out.println(message);
    }
}
