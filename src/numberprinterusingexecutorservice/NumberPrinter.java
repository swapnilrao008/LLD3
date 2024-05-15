package numberprinterusingexecutorservice;

public class NumberPrinter implements Runnable{
    private int numberTobePrinted;
    NumberPrinter(int numberTobePrinted){
        this.numberTobePrinted=numberTobePrinted;

    }

    @Override
    public void run() {
        System.out.println(numberTobePrinted+"printed by thread:"+Thread.currentThread().getName());
    }
}
