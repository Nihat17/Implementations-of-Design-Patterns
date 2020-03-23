package com.facade.pattern;

public class DvdPlayer {
    public void on(){
        System.out.println("DVD is on");
    }
    public void off(){
        System.out.println("DVD is off");
    }
    public void play(String movie){
        System.out.println("DVD is playing " + movie);
    }
    public void stop(){
        System.out.println("Dvd is stopped");
    }
    public void eject(){
        System.out.println("Dvd is ejected");
    }
}
