package producerConsumerwithmutex;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Object> queue=new ConcurrentLinkedQueue<>();
        int maxSize=6;

        Producer p1=new Producer(queue,"p1",maxSize);
        Thread t1=new Thread(p1);
        t1.start();

        Producer p2=new Producer(queue,"p2",maxSize);
        Thread t2=new Thread(p2);
        t2.start();

        Producer p3=new Producer(queue,"p3",maxSize);
        Thread t3=new Thread(p3);
        t3.start();

        Producer p4=new Producer(queue,"p4",maxSize);
        Thread t4=new Thread(p4);
        t4.start();

        Producer p5=new Producer(queue,"p5",maxSize);
        Thread t5=new Thread(p5);
        t5.start();

        Producer p6=new Producer(queue,"p6",maxSize);
        Thread t6=new Thread(p6);
        t6.start();

        Consumer c1=new Consumer(queue,"c1",maxSize);
        Thread t7=new Thread(c1);
        t7.start();

        Consumer c2=new Consumer(queue,"c2",maxSize);
        Thread t8=new Thread(c2);
        t8.start();

        Consumer c3=new Consumer(queue,"c3",maxSize);
        Thread t9=new Thread(c3);
        t9.start();

        Consumer c4=new Consumer(queue,"c4",maxSize);
        Thread t10=new Thread(c4);
        t10.start();



    }
}
