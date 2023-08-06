package org.example.seminar2.strategy;

// определение стратегии летающих птиц
public class StandartFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
