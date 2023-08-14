package org.example.seminar5.dm;

// Модель объекта
public class User {
    private int id;
    private String name;
    private String email;


    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(getId() + " - " + getName() + " - " + getEmail());
    }
}

