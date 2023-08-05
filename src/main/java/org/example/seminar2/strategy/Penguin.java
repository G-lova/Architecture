package org.example.seminar2.strategy;

public class Penguin extends Birds {

    public Penguin() {
        super(new SwimmingFlyStrategy());
    }
}
