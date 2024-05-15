package generics;

public class client {
    public static void main(String[] args) {
        pair1<String,Integer> p1=new pair1<>();
        p1.setFirst("swapnil");
        p1.setSecond(92);
        System.out.println(p1.getFirst()+"scored :"+p1.getSecond());
        pair1<Integer,Integer> p2=pair1.of(10,20);
        System.out.println("debug");
    }
}
