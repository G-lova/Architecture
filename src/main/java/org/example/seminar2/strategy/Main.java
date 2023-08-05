package org.example.seminar2.strategy;


public class Main {
    public static void main(String[] args) {

        Birds eagle = new Eagle();
        Birds chicken = new Chicken();
        Birds penguin = new Penguin();

        eagle.fill();
        chicken.fill();
        penguin.fill();
    }
}
