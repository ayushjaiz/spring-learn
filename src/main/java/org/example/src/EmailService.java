package org.example.src;

public class EmailService implements NotificationService {
    @Override
    public void send() {
        System.out.println("Email sent");
    }
}
