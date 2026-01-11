package org.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("emailService")
public class EmailService implements NotificationService {
    @Override
    public void send() {
        System.out.println("Email sent");
    }
}
