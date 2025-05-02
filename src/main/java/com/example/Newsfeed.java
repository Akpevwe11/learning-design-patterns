package com.example;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Newsfeed implements PropertyChangeListener {

    private final List<String> statuses = new ArrayList<>();
    public void printStatus(User user) {
        statuses.forEach(System.out::println);
    }

    public void printStatus(User user, String status) {
        System.out.println(status);
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent event) {
        statuses.add((String) event.getNewValue());
    }

    public void printStatus(User user, String status, String location) {
        System.out.println(status + " at " + location);
    }
}
