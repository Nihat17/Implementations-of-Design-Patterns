package com.adapter.pattern;

public class MallarDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack !");
    }
}
