package adderSubtractorSyncronisedMethod;

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

                Count.incValue(i);

        }
    }
}
