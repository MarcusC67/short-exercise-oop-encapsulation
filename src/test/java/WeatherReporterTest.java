package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherReporterTest {

    public WeatherReporter ex001;

    // Don't run following 3 tests as they test state and not behaviour -
    // means we can't set methods to private to encapsulate.
    // -----------------------------------------------------------------
    // @Test
    // public void checkGetFahrenheit() {
    //    WeatherReporter ex001 = new WeatherReporter("London", 20);
    //    double temperature = ex001.getCelsius();
    //    Assertions.assertEquals(68, ex001.getFahrenheit());
    //}

    //@Test
    //public void checkGetWeatherSymbol() {
    //    WeatherReporter ex001 = new WeatherReporter("California", 36);
    //    String location = ex001.getLocation();
    //    Assertions.assertEquals("🌅", ex001.getWeatherSymbol());
    //}

    //@Test
    //public void checkHowWeatherFeels() {
    //    WeatherReporter ex001 = new WeatherReporter("York", 7);
    //    double temperature = ex001.getCelsius();
    //    Assertions.assertEquals("It's too cold 🥶!", ex001.howWeatherFeels());
    //}

    @Test
    public void checkRunReportYork7() {
        WeatherReporter ex001 = new WeatherReporter("York", 7);
        Assertions.assertEquals("I am in York and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 44.6.", ex001.runReport());
    }

    @Test
    public void checkRunReportCalifornia36() {
        WeatherReporter ex001 = new WeatherReporter("California", 36);
        Assertions.assertEquals("I am in California and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 96.8.", ex001.runReport());
    }
}
