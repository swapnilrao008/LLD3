package designpatters.adapter;

public class app {
    public static void main(String[] args) {
        Phonepe phonepe=new Phonepe(new iciciAdapter());
        phonepe.performBankOperation();
    }
}
