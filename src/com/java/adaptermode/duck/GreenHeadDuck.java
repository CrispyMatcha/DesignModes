package com.java.adaptermode.duck;

public class GreenHeadDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("gaga");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a long distance");
    }
}
