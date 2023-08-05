package org.example.seminar2.strategy;

public class RunningFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Птица не умеет летать, она бежит");
    }
}
