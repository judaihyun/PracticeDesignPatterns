package practice_observer;

public interface Observer {
    //public void update(float temp, float humidity, float pressure);
    public void update(WeatherInfomation weatherInfo);
}
