package Lamdas;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("hello "+Thread.currentThread().getName());
    }
}
