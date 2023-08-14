package org.example.seminar5.dm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Маппер для объекта User
public class UserMapper {
    private Connection connection; // Подключение к базе данных

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    // Запрос к базе данных по id
    public User findById(int id) {
        User user = null;

        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?")) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    // Создание или обновление записи в базе данных
    public void save(User user) {
        try {
            // Если у объекта User уже есть id, то выполняем UPDATE запрос для обновления записи
            if (user.getId() != 0) {
                try (PreparedStatement updateStatement = connection.prepareStatement("UPDATE users SET name = ?, email = ? WHERE id = ?")) {
                    updateStatement.setString(1, user.getName());
                    updateStatement.setString(2, user.getEmail());
                    updateStatement.setInt(3, user.getId());
                    updateStatement.executeUpdate();
                }
            }
            // Если у объекта User нет id, то выполняем INSERT запрос для создания новой записи
            else {
                try (PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS)) {
                    insertStatement.setString(1, user.getName());
                    insertStatement.setString(2, user.getEmail());
                    insertStatement.executeUpdate();

                    ResultSet generatedKeys = insertStatement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        user.setId(generatedKeys.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Удаление записи из базы данных
    public void delete(User user) {
        try (PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
            deleteStatement.setInt(1, user.getId());
            deleteStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}