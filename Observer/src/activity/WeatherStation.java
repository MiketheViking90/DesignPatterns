package activity;

import observer.Observer;
import observer.impl.CurrentConditionDisplay;
import observer.impl.StatisticsDisplay;
import subject.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditions = new CurrentConditionDisplay(weatherData);
        Observer history = new StatisticsDisplay(weatherData);

        weatherData.register(currentConditions);
        weatherData.register(history);
        weatherData.setMeasurements(72.0, 65, 30.4);
        weatherData.setMeasurements(60.0, 25, 10.4);
    }
}
