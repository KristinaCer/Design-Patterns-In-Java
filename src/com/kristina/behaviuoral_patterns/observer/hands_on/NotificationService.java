package com.kristina.behaviuoral_patterns.observer.hands_on;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
    List<INotificationObserver> notificationObservers = new ArrayList<INotificationObserver>();

    @Override
    public void addSubscriber(INotificationObserver notificationObserver) {
        notificationObservers.add(notificationObserver);
    }

    @Override
    public void removeSubscriber(INotificationObserver notificationObserver) {
        notificationObservers.remove(notificationObserver);
    }

    @Override
    public void notifySubscriber(String notification) {
        notificationObservers.stream().forEach(notificationObserver -> notificationObserver.updateOnServerDown(notification));
    }
}
