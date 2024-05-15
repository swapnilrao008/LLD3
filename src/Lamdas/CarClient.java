package Lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarClient {
    public static void main(String[] args) {
        Car c1=new Car("audi",5000000,3000);
        Car c2=new Car("benz",8000000,2000);
        Car c3=new Car("maruthi",7000000,300);
        Car c4=new Car("toyota",6000000,1000);
        Car c5=new Car("ferrari",50000000,8000);
        Car c6=new Car("tata",500000,1000);

        List<Car> cars=new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
//        Comparator<Car> c=new Comparator<Car>() {
//            @Override
//            public int compare(Car c1, Car c2) {
//                return c2.price-c1.price;
//            }
//        };
//        Collections.sort(cars,c);
//        System.out.println(cars);

        Collections.sort(cars,(x1,x2)->{return x2.power-x1.power;});
        System.out.println(cars);
    }
}
