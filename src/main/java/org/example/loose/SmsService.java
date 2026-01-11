package org.example.loose;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements NotificationService{
    @Override
    public void send() {
        System.out.println("SMS sent");
    }
}
