package numberprinterusingexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(10);

        for(int i=0;i<=100;i++)
        {
            if(i==11||i==41||i==99)
            {
                System.out.println("Debug");
            }
            NumberPrinter task=new NumberPrinter(i);
            ex.submit(task);
        }
        ex.shutdown();
    }
}
