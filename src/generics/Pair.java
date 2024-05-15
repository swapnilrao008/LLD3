package generics;

public class Pair <V,S>{
    V first;
    S second;
     public V getFirst()
     {
         return first;
     }
    public S getSecond()
    {
        return second;
    }
    public void setFirst(V first)
    {
        this.first=first;
    }
    public void setSecond(S second)
    {
        this.second=second;
    }
    public static <T> void doSomething(T t)
    {
        System.out.println(t);
    }
}
