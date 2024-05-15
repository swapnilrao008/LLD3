package methodoverriding;

public class client {
    public static void main(String[] args) {
        A a=new A();
        a.doSomething("scaler");

        a=new B();
        a.doSomething("scaler");

        B b=new B();
        b.doSomething("scaler");
    }
}
