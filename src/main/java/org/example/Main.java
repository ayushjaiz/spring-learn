package org.example;

import org.example.loose.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.sayHello();

        User user = context.getBean(User.class);
        user.notifyUser();
    }
} 