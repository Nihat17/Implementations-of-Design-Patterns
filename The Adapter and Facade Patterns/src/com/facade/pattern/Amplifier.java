package com.facade.pattern;

public class Amplifier {
    public void on(){
        System.out.println("Amplifier is on");
    }
    public void off(){
        System.out.println("Amplifier is off");
    }
    public void setDvd(DvdPlayer dvd){
        System.out.println("Dvd is set to " + dvd.getClass().getName());
    }
    public void setSurroundSound(){
        System.out.println("Surround sound is set");
    }
    public void setVolume(int volume){
        System.out.println("Volume is " + volume);
    }
}
