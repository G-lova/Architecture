package org.example.seminar2.strategy;

public class Chicken extends Birds {

    public Chicken() {
        super(new RunningFlyStrategy());
    }
}
