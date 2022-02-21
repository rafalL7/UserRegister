package classes;

import interfaces.User;

public class AddUser implements User {
    String name;
    String surName;
    String email;

    @Override
    public String getSurName() {
        return surName;
    }

    @Override
    public String setSurName(String surName) {
        this.surName = surName;
        return surName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail() {
        setEmail();
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        this.name = name;
        return name;
    }
}


