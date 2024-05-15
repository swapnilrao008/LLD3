package designpatters.builder;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        new Student("swapnil",54,89,"sicet",278,2019,"8550979925");
//        Map<String, Object> map=new HashMap<>();
//
//        map.put("name","Swapnil");
//        map.put("age","27");
//        Student st1=new Student(map);
//
//        Builder builder=new Builder();
//        builder.setAge(26);
//        builder.setName("Swapnil");
//        Student st2=new Student(builder);

//        Builder builder1 = Student.getBuilder();
//        builder1.setAge(26);
//        builder1.setName("Swapnil");
//        builder1.setId(278);
//        Student build = builder1.build();

        Student finalversion = Student.getBuilder().setId(278).setName("swapnil").setAge(27).build();
        System.out.println("debug");
    }
}
