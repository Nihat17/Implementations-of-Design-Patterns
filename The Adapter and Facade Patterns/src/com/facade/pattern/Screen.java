package com.facade.pattern;

public class Screen {
    public void on(){
        System.out.println("Screen is on");
    }
    public void off(){
        System.out.println("Screen is off");
    }

    public void down() {
        System.out.println("Theater Screen going down");
    }

    public void up() {
        System.out.println("Theater Screen going up");
    }
}
