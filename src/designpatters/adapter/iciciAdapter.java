package designpatters.adapter;

public class iciciAdapter implements BankApi{
    @Override
    public double getBalance() {
        System.out.println("getting the balance from icici bank");
        return 0;
    }

    @Override
    public void transferFunds(String from, String to, Double amount) {
        System.out.println("transfering the amount from icici bank");

    }
}
