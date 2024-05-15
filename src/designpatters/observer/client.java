package designpatters.observer;

public class client {
    public static void main(String[] args) {
        flipkart flp=flipkart.getInstance();
        emailSender emailSender = new emailSender();
        invoiceGenerator invoiceGenerator = new invoiceGenerator();
        warehouseManagement warehouseManagement = new warehouseManagement();
        flp.orderPlaced();


    }
}
