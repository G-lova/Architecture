package org.example.seminar2.strategy;

public class StandartFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
