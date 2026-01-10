package org.example.src;

public class Main {
  public static void main(){
    EmailService emailService = new EmailService();
    SmsService smsService = new SmsService();
    User user = new User(smsService);

    user.notifyUser();
  }


}