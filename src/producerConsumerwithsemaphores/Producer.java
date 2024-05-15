package producerConsumerwithsemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private String name;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    Producer(Queue<Object> queue,String name,int maxSize,Semaphore producerSemaphore,Semaphore consumerSemaphore)
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
                //synchronized (queue) {
                //if (queue.size() < maxSize) {
                     try {
                    producerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + "is producing an element and size of queue is:" + queue.size());

                queue.add(new Object());
                consumerSemaphore.release();

        }

    }
}
