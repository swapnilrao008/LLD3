package producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private String name;
    private int maxSize;
    Consumer(Queue<Object> queue,String name,int maxSize)
    {
        this.queue=queue;
        this.name=name;
        this.maxSize=maxSize;
    }
    @Override
    public void run() {
        while(true)
        {
            if (queue.size()>0) {
                System.out.println(name+"is consuming an element and size of queue is:"+queue.size());
                queue.remove();
            }
        }

    }
}
