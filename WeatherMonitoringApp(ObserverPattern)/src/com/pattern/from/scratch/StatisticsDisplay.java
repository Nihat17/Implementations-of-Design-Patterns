package com.pattern.from.scratch;

import com.pattern.from.scratch.DisplayElement;
import com.pattern.from.scratch.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject subject){
        weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temporary statistics!");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
