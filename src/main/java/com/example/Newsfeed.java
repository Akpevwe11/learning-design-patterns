package com.example;

public class Newsfeed {
    public void printStatus(User user) {
        System.out.println(user.getStatus());
    }

    public void printStatus(User user, String status) {
        System.out.println(status);
    }

    public void printStatus(User user, String status, String location) {
        System.out.println(status + " at " + location);
    }
}
