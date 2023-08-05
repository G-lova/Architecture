package org.example.seminar2.strategy;

public class Birds {

    private FlyStrategy flyStrategy;

    public Birds(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fill() {
        this.flyStrategy.fly();
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }
}
