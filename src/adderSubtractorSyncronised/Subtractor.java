package adderSubtractorSyncronised;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    count Count;

    Subtractor(count Count)
    {
        this.Count=Count;

    }
    @Override
    public void run() {
        for(int i=0;i<100000;i++)
        {

            synchronized (Count) {
                Count.value -= i;

            }
        }
    }
}
