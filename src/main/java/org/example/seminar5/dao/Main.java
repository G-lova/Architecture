package org.example.seminar5.dao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание базы данных пользователей
        UserDao userDao = new UserDaoImpl();

        // Добавление пользователей
        userDao.addUser(new User("John", "john@example.com"));
        userDao.addUser(new User("Alice", "alice@example.com"));

        // Получение всех пользователей
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }

        // Обновление пользователя
        User user = userDao.getUserById(2);
        if (user != null) {
            user.setName("Updated Name");
            user.setEmail("updated@example.com");
            userDao.updateUser(user);
        }

        // Удаление пользователя
        User userToDelete = userDao.getUserById(1);
        if (userToDelete != null) {
            userDao.deleteUser(userToDelete);
        }

        // Опять получаем всех пользователей после обновления и удаления
        users = userDao.getAllUsers();
        for (User u : users) {
            System.out.println(u.toString());
        }
    }
}
