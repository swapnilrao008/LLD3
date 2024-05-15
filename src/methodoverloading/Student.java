package methodoverloading;

public class Student {
    String name;
    int age;
    void hello(String name)
    {
        System.out.println("hello"+name);
    }
//    String hello(String name)
//    {
//        System.out.println("hello"+name);
//    }
void hello()
{
    System.out.println("hello");
}
}
