/**
 * Created by rvgorlov on 05.07.16.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80,55,43.4f);
        weatherData.setMeasurements(81,25,43.4f);
        weatherData.setMeasurements(82,35,43.4f);
    }
}
