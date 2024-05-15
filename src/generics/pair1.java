package generics;

public class pair1<T,Q> {
    private T first;

    private Q second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public Q getSecond() {
        return second;
    }

    public void setSecond(Q second) {
        this.second = second;
    }
    private pair1(T first,Q second){
        this.first=first;
        this.second=second;

    }
     pair1(){};


    public static <a,b> pair1<a,b> of(a first,b second)
    {
        return new pair1<>(first,second);
    }
}
