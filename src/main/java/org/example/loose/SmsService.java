package org.example.loose;

public class SmsService implements NotificationService{
    @Override
    public void send() {
        System.out.println("SMS sent");
    }
}
