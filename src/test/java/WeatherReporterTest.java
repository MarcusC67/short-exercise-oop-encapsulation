package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherReporterTest {

    public WeatherReporter ex001;

    @Test
    public void checkGetFahrenheit() {
        // Arrange - setting up the objects needed for tests
        WeatherReporter ex001 = new WeatherReporter("London", 20);
        double temperature = ex001.getCelsius();
        // Act - action you take, ie: run the code you want to test
        // Assert - what you are testing for - actual vs. expected result
        Assertions.assertEquals(68, ex001.getFahrenheit());
    }

    @Test
    public void checkGetWeatherSymbol() {
        WeatherReporter ex001 = new WeatherReporter("California", 36);
        String location = ex001.getLocation();
        Assertions.assertEquals("🌅", ex001.getWeatherSymbol());
    }

    @Test
    public void checkHowWeatherFeels() {
        WeatherReporter ex001 = new WeatherReporter("York", 7);
        double temperature = ex001.getCelsius();
        Assertions.assertEquals("It's too cold 🥶!", ex001.howWeatherFeels());
    }

    // add more
}
