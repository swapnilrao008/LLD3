package designpatters.observer;

public class warehouseManagement implements orderPlacedSubscriber{
   public warehouseManagement(){
       flipkart.getInstance().registerSubscriber(this);
   };
    @Override
    public void announcdOrderPlacement() {
        System.out.println("warehouse data updating");
    }
}
