package subject;

import observers.CurrentConditionDisplay;
import observers.HeatIndexDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(20, 10, 15);
    }
}
