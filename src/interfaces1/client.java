package interfaces1;

public class client {
    public static void main(String[] args) {
        Animal a=new dog();
        dog d=new dog();
        Cat c=new Cat();
        a.eat();
        a.run();
        a.walk();

        c.eat();
        c.walk();
        c.meow();
        c.run();

        d.bark();
        System.out.println("debug");
    }
}
