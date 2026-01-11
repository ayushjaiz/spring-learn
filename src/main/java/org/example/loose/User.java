package org.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("User")
public class User {
    NotificationService notificationService;

    @Autowired
    public User(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.send();
    }
}
