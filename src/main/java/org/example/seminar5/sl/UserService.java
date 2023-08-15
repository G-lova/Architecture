package org.example.seminar5.sl;

import java.util.List;

// Service interface
public interface UserService {
    User getUserById(int id);

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}

