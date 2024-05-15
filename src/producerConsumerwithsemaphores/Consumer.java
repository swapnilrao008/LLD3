package producerConsumerwithsemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private String name;
    private int maxSize;
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;
    Consumer(Queue<Object> queue, String name, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore)
    {
        this.queue=queue;
        this.name=name;
        this.maxSize=maxSize;
        this.consumerSemaphore=consumerSemaphore;
        this.producerSemaphore=producerSemaphore;
    }
    @Override
    public void run() {

            while (true) {
               // synchronized (queue) {
                //if (queue.size() > 0) {

                try {
                    consumerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + "is consuming an element and size of queue is:" + queue.size());

                queue.remove();
                producerSemaphore.release();
                }



    }
}
