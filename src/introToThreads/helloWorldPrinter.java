package introToThreads;

public class helloWorldPrinter implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Hello world printed by: "+Thread.currentThread().getName());
    }
}
