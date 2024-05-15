package designpatters.observer;

public class invoiceGenerator implements orderPlacedSubscriber{
    public invoiceGenerator(){
        flipkart.getInstance().registerSubscriber(this);
    };
    @Override
    public void announcdOrderPlacement() {
        System.out.println("Generating invoice");
    }
}
