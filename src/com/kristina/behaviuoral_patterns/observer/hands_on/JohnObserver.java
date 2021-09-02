package com.kristina.behaviuoral_patterns.observer.hands_on;

public class JohnObserver implements INotificationObserver{
    @Override
    public void updateOnServerDown(String message) {
        System.out.println("John" + message);
    }
}
