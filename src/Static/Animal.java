package Static;

public class Animal {
    int age;
   static int count;
   public Animal(){
       count++;
   }
   static void doSomething(){
       System.out.println("i am a general animal");
   }
}
