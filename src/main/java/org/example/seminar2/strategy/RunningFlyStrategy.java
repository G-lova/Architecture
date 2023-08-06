package org.example.seminar2.strategy;

// переопределение стратегии бегающих птиц
public class RunningFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Птица не умеет летать, она бежит");
    }
}
