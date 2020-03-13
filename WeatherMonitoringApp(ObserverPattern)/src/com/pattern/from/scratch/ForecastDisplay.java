package com.pattern.from.scratch;

import com.pattern.from.scratch.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject subject){
        weatherData = subject;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Temporary display of forecast!");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
