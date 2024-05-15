package Static;

public class client {

    public static void main(String[] args) {
        Animal a=new Animal();
        Animal a1=new Animal();
        System.out.println(Animal.count);
        System.out.println(a1.count);
        Animal a2=new Animal();

        System.out.println(Animal.count);
        Animal.doSomething();

        Animal a3=new Dog();
        Animal d=new Dog();

        a1.doSomething();
        a3.doSomething();
        d.doSomething();

    }
}
