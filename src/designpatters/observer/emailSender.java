package designpatters.observer;

public class emailSender implements orderPlacedSubscriber{

    @Override
    public void announcdOrderPlacement() {
        System.out.println("Sending emails");

    }
    public emailSender(){
        flipkart.getInstance().registerSubscriber(this);
    }
}
