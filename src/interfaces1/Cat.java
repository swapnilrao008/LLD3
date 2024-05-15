package interfaces1;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void run() {
        System.out.println("cat is running");
    }

    @Override
    public void walk() {
        System.out.println("cat is walking");
    }

    public void meow(){
        System.out.println("cat is meowing");
    }
}
