package introToThreads;

public class client {
    public static void main(String[] args) {
        System.out.println("Hello Threads.Printed by: "+Thread.currentThread().getName());
        helloWorldPrinter hp=new helloWorldPrinter();
        Thread t1=new Thread(hp);
        t1.start();
        System.out.println("Hello Threads.Printed by: "+Thread.currentThread().getName());
    }
}
