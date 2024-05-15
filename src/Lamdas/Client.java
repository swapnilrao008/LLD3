package Lamdas;

public class Client {
    public static void main(String[] args) {

        //way 1
        HelloWorldPrinter hp=new HelloWorldPrinter();
        Thread t=new Thread(hp);
        t.start();

        //way2
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from runnable object using anonymous class"+Thread.currentThread().getName());
            }
        };
        Thread t1=new Thread(r);
        t1.start();

        //way3
        Thread t2=new Thread(()->{
            System.out.println("Hello using lamdas"+Thread.currentThread().getName());
        });
        t2.start();

    }
}
