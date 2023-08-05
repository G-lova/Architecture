package org.example.seminar2.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State StartState = new StartState();
        State StopState = new StopState();

        context.setState(StartState);
        context.doAction();

        context.setState(StopState);
        context.doAction();

    }
}
