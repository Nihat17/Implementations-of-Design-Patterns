package com.pattern.from.scratch;

import com.pattern.from.scratch.Observer;
import com.pattern.from.scratch.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int indexOfObserver = observers.indexOf(observer);
        if(indexOfObserver >= 0)
            observers.remove(indexOfObserver);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
