package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private final String location;
    private double celsius;

    // input celsius and location
    public WeatherReporter(String location, double celsius) {
        this.location = location;
        this.celsius = celsius;
    }

    public String getLocation() {
        return location;
    }

    public double getCelsius() {
        return celsius;
    }

    // print message in particular format
    public String runReport() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location,
                getWeatherSymbol(),
                howWeatherFeels(),
                getFahrenheit());
    }

    // calculate fahrenheit from celsius input
    private double getFahrenheit() {
        return (9.0 / 5.0) * celsius + 32;
    }

    // if London, California or Cape Town return specific icon, for all others return a different icon
    private String getWeatherSymbol() {
        if (location == "London") {
            return "🌦";
        } else if (location == "California") {
            return "🌅";
        } else if (location == "Cape Town") {
            return "🌤";
        }
        return "🔆";
    }

    // depending on celsius return string
    private String howWeatherFeels() {
        if (celsius > 30) {
            return "It's too hot 🥵!";
        } else if (celsius < 10) {
            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }

}