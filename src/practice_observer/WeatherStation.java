package practice_observer;

public class WeatherStation {
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();



        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        //StatisticsDispaly statisticsDisplay = new StatisticsDispaly(weatherData);
        ForecastDisplay forecaseDisplay = new ForecastDisplay(weatherData);



        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 130.4f);
        weatherData.setMeasurements(78, 90, 35.88f);
    }
}
