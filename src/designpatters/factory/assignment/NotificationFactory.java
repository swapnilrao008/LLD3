package designpatters.factory.assignment;

public class NotificationFactory {
    public static Notification createNotification(NotificationType notificationType, String recipient, String message, String sender){
        switch(notificationType){
            case EMAIL:return new EmailNotification(recipient,sender,message);
            case SMS:return new SmsNotification(recipient,message);
            case PUSH:return new PushNotification(recipient,message);
        }
        return null;

    }
}