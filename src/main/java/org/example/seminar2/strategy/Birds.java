package org.example.seminar2.strategy;

// описание общего поведения птиц
public class Birds {

    private FlyStrategy flyStrategy;

    public Birds(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly() {
        this.flyStrategy.fly();
    }

    public void speak() {
        System.out.println("Издает звуки");
    }

    public void eat() {
        System.out.println("Ест");
    }
}
