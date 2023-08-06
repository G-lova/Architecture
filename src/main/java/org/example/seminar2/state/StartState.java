package org.example.seminar2.state;

// описание включенного состояния
public class StartState implements State {

    @Override
    public void doAction() {
        System.out.println("Device is turned ON");
    }

}
