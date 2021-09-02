package com.kristina.behaviuoral_patterns.observer.hands_on;

public class SteveObserver implements INotificationObserver{
    @Override
    public void updateOnServerDown(String message) {
        System.out.println("Steve"+message);
    }
}
