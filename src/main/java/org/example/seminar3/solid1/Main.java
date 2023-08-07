package org.example.seminar3.solid1;

public class Main {
    public static void main(String[] args) {
        Print pr = new Print();
        Save sv = new Save();

        Book book = new Book("Властелин Колец", "Толкин");
        sv.save(book);
        pr.print(book);
    }
}
