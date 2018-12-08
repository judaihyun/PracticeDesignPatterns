package practice_observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private WeatherInfomation weatherConditionInfo;

    public CurrentConditionsDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
        weatherConditionInfo = new WeatherInfomation();
    }

    public void update(Observable obs, Object arg)
    {
        if(obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)obs;
            weatherConditionInfo.temperature = weatherData.getTemperature();
            weatherConditionInfo.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + weatherConditionInfo.temperature
        + "F degrees and " + weatherConditionInfo.humidity + "% humidity");
    }

}
