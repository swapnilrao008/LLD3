package interfaces1;

public class dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public void run() {
        System.out.println("dog is running");
    }

    @Override
    public void walk() {
        System.out.println("dog is walking ");
    }
    public void bark(){
        System.out.println("dog is barking");
    }
}
