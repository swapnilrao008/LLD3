package designpatters.observer;

import java.util.ArrayList;
import java.util.List;

public class flipkart {
    private static flipkart instance;
    private List<orderPlacedSubscriber> OrderPlacedSubscribers=new ArrayList<>();



    public static flipkart getInstance(){
        if(instance==null) {
            instance = new flipkart();
        }
        return instance;
    }
    void registerSubscriber(orderPlacedSubscriber subscriber)
    {
        OrderPlacedSubscribers.add(subscriber);
    }
    void unregisterSubscriber(orderPlacedSubscriber subscriber)
    {
        OrderPlacedSubscribers.remove(subscriber);
    }

    void orderPlaced(){
        for(orderPlacedSubscriber x:OrderPlacedSubscribers)
        {
            x.announcdOrderPlacement();
        }
    }
    private flipkart() {

    }
}
