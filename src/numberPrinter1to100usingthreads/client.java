package numberPrinter1to100usingthreads;

public class client {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++)
        {
            NumberPrinter task=new NumberPrinter(i);
            Thread t=new Thread(task);
            t.start();
        }
    }
}
