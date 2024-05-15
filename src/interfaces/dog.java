package interfaces;

public class dog extends Animal implements Runner,protector {
    String name;
    public void run()
    {
        System.out.println("i run can like a dog");
    }
    public String protect()
    {
        return "i am a loyal pet";
    }
}
