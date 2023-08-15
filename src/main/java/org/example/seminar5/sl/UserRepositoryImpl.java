package org.example.seminar5.sl;

import java.util.ArrayList;
import java.util.List;

// Repository implementation
public class UserRepositoryImpl implements UserRepository {
    private List<User> users;

    public UserRepositoryImpl() {
        users = new ArrayList<>();
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
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(i);
                return;
            }
        }
    }
}
