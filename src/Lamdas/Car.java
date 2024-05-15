package Lamdas;

public class Car {
    String name;
    int price;
    int power;
    Car(String name,int price,int power){
        this.name=name;
        this.power=power;
        this.price=price;
    }

    public String toString(){
        return "[ Name:"+this.name+",Price: "+this.price+",Power: "+this.power+"\n]";
    }
}
