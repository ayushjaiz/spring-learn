package org.example.loose;

public class Main {
  public static void main(){
    EmailService emailService = new EmailService();
    SmsService smsService = new SmsService();
    User user = new User(smsService);

    user.notifyUser();
  }


}