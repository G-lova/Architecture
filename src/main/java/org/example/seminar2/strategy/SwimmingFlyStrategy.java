package org.example.seminar2.strategy;

public class SwimmingFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Птица не умеет летать, она плывёт");
    }
}
