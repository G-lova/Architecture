package org.example.seminar2.state;
// описание выключенного состояния

public class StopState implements State {

    @Override
    public void doAction() {
        System.out.println("Device is turned OFF");
    }

}
