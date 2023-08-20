package org.example.seminar6.data;

import org.example.seminar6.domain.Book;

import java.util.ArrayList;
import java.util.List;

// Класс, реализующий хранилище книг с использованием коллекций
public class InMemoryBookRepository implements BookRepository {
    private List<Book> books;

    /**
     * Создает новый экземпляр класса InMemoryBookRepository.
     */
    public InMemoryBookRepository() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
