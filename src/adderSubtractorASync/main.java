package adderSubtractorASync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) throws InterruptedException {
        count c=new count();
        Lock lock=new ReentrantLock();
        adder a=new adder(c,lock);
        Subtractor s=new Subtractor(c,lock);
        Thread t1=new Thread(a);
        Thread t2=new Thread(s);
        t2.start();
        t1.start();
        t1.join();
        t2.join();
        System.out.println(c.value);
    }
}
