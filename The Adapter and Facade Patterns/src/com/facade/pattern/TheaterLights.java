package com.facade.pattern;

public class TheaterLights {
    public void dim(int val){
        System.out.println("Lights are " + val + "%");
    }
    public void on(){
        System.out.println("Lights are on");
    }
}
