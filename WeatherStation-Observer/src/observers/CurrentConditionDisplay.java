package observers;

import subject.DisplayElement;
import subject.Observer;
import subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("Weather is : " + temperature + "degrees Celsius, " + humidity +"% humidity");
    }

}
