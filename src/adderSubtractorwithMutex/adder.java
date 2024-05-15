package adderSubtractorwithMutex;

import java.util.concurrent.locks.Lock;

public class adder implements Runnable{
    count Count;
    Lock lock;
    adder(count Count,Lock lock)
    {
        this.Count=Count;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=0;i<100000;i++)
        {
            lock.lock();
            Count.value+=i;
            lock.unlock();
        }
    }
}
