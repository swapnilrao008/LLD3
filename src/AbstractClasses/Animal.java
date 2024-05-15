package AbstractClasses;

public abstract class Animal {
    int age;
    int id;

    void die()
    {
        System.out.println("I am dying");
    }
    abstract void move();
    abstract void attack();
}
