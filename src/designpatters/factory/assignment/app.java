package designpatters.factory.assignment;

import static designpatters.factory.assignment.NotificationType.EMAIL;
import static designpatters.factory.assignment.NotificationType.PUSH;

public class app {
    public static void main(String[] args) {
        NotificationFactory n= new NotificationFactory();
        Notification x=n.createNotification(PUSH,"Swapnil","Hi bala","Balaji");
        x.sendNotification();
        System.out.println("debug");
    }
}
