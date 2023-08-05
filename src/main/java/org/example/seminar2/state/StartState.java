package org.example.seminar2.state;

public class StartState implements State {

    @Override
    public void doAction() {
        System.out.println("Device is turned ON");
    }

}
