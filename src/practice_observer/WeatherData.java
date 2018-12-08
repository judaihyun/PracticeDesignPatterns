package practice_observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

    private ArrayList<Observer> observers;
    /*
    private float temperature;
    private float humidity;
    private float pressure;
    */
    WeatherInfomation weatherInfo;

    public WeatherData() {
        weatherInfo = new WeatherInfomation();
    };

    public void setMeasurements(float temp, float humid, float pres)
    {
        weatherInfo.temperature = temp;
        weatherInfo.humidity = humid;
        weatherInfo.pressure = pres;
        measurementsChanged();
    }

    public void measurementsChanged()
    {
        super.setChanged();
        super.notifyObservers();
    }

    public float getTemperature(){ return weatherInfo.temperature;};
    public float getHumidity(){ return weatherInfo.humidity;};
    public float getPressure(){ return weatherInfo.pressure ;};
}
