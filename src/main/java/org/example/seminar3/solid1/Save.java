package org.example.seminar3.solid1;

public class Save {
    public void save(Book book) {
        System.out.println("Сохранение информации о книге '" + book.getTitle() + "' в базе данных.");
    }
}