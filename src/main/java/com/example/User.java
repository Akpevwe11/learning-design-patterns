package com.example;

public class User {
    private String status;
    private String name;

    public User() {
        this.status = "No status set";
        this.name = "Anonymous";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
