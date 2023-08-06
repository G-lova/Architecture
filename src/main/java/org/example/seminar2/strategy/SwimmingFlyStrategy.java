package org.example.seminar2.strategy;
// переопределение стратегии водоплавающих птиц

public class SwimmingFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Птица не умеет летать, она плывёт");
    }
}
