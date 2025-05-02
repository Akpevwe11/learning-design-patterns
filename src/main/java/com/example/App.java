package com.example;

public class App {
    public static void main(String[] args) {
        Location location = new Location();
        WeatherUpdates weatherUpdates = new WeatherUpdates();

        location.addPropertyChangeListener(weatherUpdates);

        location.setWeatherEvent("Sunny");
        location.setWeatherEvent("Rainy");
        location.setWeatherEvent("Cloudy");

        weatherUpdates.printUpdates();
    }
}
