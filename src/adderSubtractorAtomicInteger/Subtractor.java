package adderSubtractorAtomicInteger;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    count Count;
    Subtractor(count Count, Lock lock)
    {
        this.Count=Count;
    }
    @Override
    public void run() {
        for(int i=0;i<100000;i++)
        {
            Count.value.getAndAdd(-i);
        }
    }
}
