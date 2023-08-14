package org.example.seminar5.dao;

// Класс элементов базы данных
public class User {
    private int id;
    private static int counter = 1;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = counter++;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String updatedName) {
        this.name = updatedName;
    }

    public void setEmail(String updatedEmail) {
        this.email = updatedEmail;
    }
    @Override
    public String toString() {
        return String.format(getId() + " - " + getName() + " - " + getEmail());
    }
}
