package org.example.seminar5.dao;
// Интерфейс, описывающий методы доступа к данным

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
