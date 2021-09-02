package com.kristina.behaviuoral_patterns.observer.hands_on;

public class Main {


    public static void main(String[] args) {
        INotificationObserver johnObserver = new JohnObserver();
        INotificationObserver steveObserver = new SteveObserver();
        INotificationService notificationService = new NotificationService();
        notificationService.addSubscriber(johnObserver);
        notificationService.addSubscriber(steveObserver);
        notificationService.notifySubscriber(" DATABASE CRASH!!!");
        notificationService.removeSubscriber(johnObserver);
        notificationService.notifySubscriber(" DATABASE CRASH AGAIN!!!");
    }
}
