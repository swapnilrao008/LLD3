package designpatters.adapter;

public class Phonepe {
    private BankApi bankApi;

    public Phonepe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public void performBankOperation(){
        bankApi.getBalance();
        bankApi.transferFunds("swapnil","balaji",50000.10);
    }

}

