package com.kristina.behaviuoral_patterns.observer.hands_on;

public interface INotificationService {
    void addSubscriber(INotificationObserver notificationObserver);
    void removeSubscriber(INotificationObserver notificationObserver);
    void notifySubscriber(String notification);
}
