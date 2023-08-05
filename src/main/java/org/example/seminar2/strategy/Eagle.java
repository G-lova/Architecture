package org.example.seminar2.strategy;

public class Eagle extends Birds {

    public Eagle() {
        super(new StandartFlyStrategy());
    }
}
