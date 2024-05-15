package generics;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Pair<Double,Double> pair=new Pair<>();
        pair.setFirst(1234.5);
        pair.setSecond(4565.55);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        Pair<String,String> pair1=new Pair<>();
        pair1.setFirst("swapnil");
        pair1.setSecond("Rao");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        //System.out.println(doSomething(10));
        pair.doSomething(10);
        pair.doSomething("swapnil");

    }
}
