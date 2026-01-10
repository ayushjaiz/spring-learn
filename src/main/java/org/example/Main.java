package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        GreetingService greetingService = (GreetingService) context.getBean("myBean");
        greetingService.sayHello();
    }
}