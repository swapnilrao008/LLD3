package constructors;

public class client {
    public static void main(String[] args) {
        student st=new student("swapnil",24,85,"dec22");
        student st1=new student();
        student st2=new student(st);
        student st3=new student(25,"swapnil");



        System.out.println("debug");
    }
}
