package org.example.src;

public class User {
    NotificationService notificationService;
    public User(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(){
        notificationService.send();
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
