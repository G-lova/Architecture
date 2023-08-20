package org.example.seminar6.domain;

// Класс представляющий книгу
public class Book {
    private String id;
    private String title;
    private String author;
    private double price;

    /**
     * Создает новый экземпляр класса Book.
     *
     * @param id     идентификатор книги.
     * @param title  название книги.
     * @param author автор книги
     * @param price  цена книги.
     */
    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Геттеры, сеттеры
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

}
