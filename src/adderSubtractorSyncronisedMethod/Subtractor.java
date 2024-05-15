package adderSubtractorSyncronisedMethod;

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
            Count.incValue(-i);
        }
    }
}
