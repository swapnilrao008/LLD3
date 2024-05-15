package designpatters.factory;

import designpatters.factory.Android.AndroidUIFactory;
import designpatters.factory.IOS.IOSUIFactory;

public class App {
    public static void main(String[] args) {
        System.out.println("page layout for android");
        Flutter flutter=new Flutter(new AndroidUIFactory());
        flutter.pageLayout();

        System.out.println("page layout for ios");
        Flutter flutter1=new Flutter(new IOSUIFactory());
        flutter1.pageLayout();

    }
}
