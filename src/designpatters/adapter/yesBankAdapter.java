package designpatters.adapter;

public class yesBankAdapter implements BankApi{

    @Override
    public double getBalance() {
        System.out.println("getting the balance from yes bank");
        return 0;
    }

    @Override
    public void transferFunds(String from, String to, Double amount) {
        System.out.println("transfering the amount from yes bank");

    }
}
