package adderSubtractorSyncronisedMethod;

public class count {
    private int value=0;
    public int getValue(){
        return value;
    }
    public synchronized void incValue(int i)
    {
        value+=i;
    }
}
