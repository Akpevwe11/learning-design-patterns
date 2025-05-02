package com.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class User {
    private String status;
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private String name;

    public User() {
        this.status = "No status set";
        this.name = "Anonymous";
    }

    public void setStatus(String status) {
        support.firePropertyChange("status", this.status, status);
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

    public void addPropertyChangeListener(Newsfeed newsfeed) {
        support.addPropertyChangeListener((PropertyChangeListener) newsfeed);
    }
}
