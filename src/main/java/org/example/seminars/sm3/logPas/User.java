package org.example.seminars.sm3.logPas;

public class User {

    String name;
    String password;
    private final boolean isAdmin;

    boolean isAuthenticate;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User(String name, String password) {
        this(name, password, false);
    }

    //3.6.
    public boolean login(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            isAuthenticate = true;
            return true;
        }
        return false;
    }

    public boolean logOut(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            isAuthenticate = false;
            return true;
        }
        return false;
    }

}