package org.example.seminar3.solid5;

public class Text implements Printer {
    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
