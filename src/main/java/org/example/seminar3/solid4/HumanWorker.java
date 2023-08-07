package org.example.seminar3.solid4;

public class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Человек работает");
    }

    public void eat() {
        System.out.println("Человек ест");
    }
}
