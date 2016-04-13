package observer.impl;

import java.util.ArrayList;
import java.util.List;

import observer.DisplayElement;
import observer.Observer;
import subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private static final String DISPLAY_FORMAT = "Avg/Max/Min temperature = "
            + "%1.2f/%1.2f/%1.2f";

    private List<Double> temperatureHistory;
    double max;
    double min;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        temperatureHistory = new ArrayList<>();
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        updateMax(temp);
        updateMin(temp);
        temperatureHistory.add(temp);
        display();
    }

    @Override
    public void display() {
        String message = String.format(DISPLAY_FORMAT,
                getAverage(),
                max,
                min);
        System.out.println(message);
    }

    private double getAverage() {
        return temperatureHistory.stream().mapToDouble(val -> val).average().getAsDouble();
    }

    private void updateMax(double temp) {
        boolean shouldUpdate = ((temperatureHistory.size() == 0) || temp > max);
        if (shouldUpdate) {
            max = temp;
        }
    }

    private void updateMin(double temp) {
        boolean shouldUpdate = ((temperatureHistory.size() == 0) || temp < min);
        if (shouldUpdate) {
            min = temp;
        }
    }
}
