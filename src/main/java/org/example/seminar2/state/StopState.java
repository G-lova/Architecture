package org.example.seminar2.state;

public class StopState implements State {

    @Override
    public void doAction() {
        System.out.println("Device is turned OFF");
    }

}
