package practice_observer;

public class StatisticsDispaly implements  Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDispaly(WeatherData weatherData)
    {
        this.weatherData = weatherData;
    }

    @Override
    public void update(WeatherInfomation wetherInfo)
    {
        tempSum += wetherInfo.temperature;
        numReadings++;

        if (wetherInfo.temperature > maxTemp) {
            maxTemp = wetherInfo.temperature;
        }

        if (wetherInfo.temperature < minTemp) {
            minTemp = wetherInfo.temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
