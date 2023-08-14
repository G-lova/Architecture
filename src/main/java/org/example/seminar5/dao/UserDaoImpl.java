package org.example.seminar5.dao;
// Класс для создания базы данных

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<>();
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(User user) {
        for (User existingUser : users) {
            if (existingUser.getId() == user.getId()) {
                existingUser.setName(user.getName());
                existingUser.setEmail(user.getEmail());
                break;
            }
        }
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
}
