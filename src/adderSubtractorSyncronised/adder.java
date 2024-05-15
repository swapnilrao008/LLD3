package adderSubtractorSyncronised;

import java.util.concurrent.locks.Lock;

public class adder implements Runnable{
    count Count;
    adder(count Count)
    {
        this.Count=Count;

    }
    @Override
    public void run() {

        for(int i=0;i<100000;i++)
        {
            synchronized (Count) {
                Count.value += i;

            }
        }
    }
}
