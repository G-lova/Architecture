package org.example.seminar5.sl;

import java.util.List;

// Repository interface
public interface UserRepository {
    User getUserById(int id);

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
