package org.example.seminar6.data;

import org.example.seminar6.domain.Book;

import java.util.List;

/**
 * Интерфейс BookRepository определяет методы для управления книгами в интернет-магазине.
 */
public interface BookRepository {
    /**
     * Добавляет книгу в список репозитория.
     *
     * @param book книга для добавления.
     */

    public void addBook(Book book);

    /**
     * Удаляет книгу из списка репозитория.
     *
     * @param book книга для удаления.
     */

    public void removeBook(Book book);

    /**
     * Получает список всех книг из репозитория.
     */

    public List<Book> getAllBooks();
}
