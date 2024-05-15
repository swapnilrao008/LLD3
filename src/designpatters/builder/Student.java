package designpatters.builder;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private long id;
    private int gradYear;
    private String phoneNumber;

//    public Student(String name, int age, double psp, String universityName, long id, int gradYear, String phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.psp = psp;
//        this.universityName = universityName;
//        this.id = id;
//        this.gradYear = gradYear;
//        this.phoneNumber = phoneNumber;
//    }

//    public Student(Map<String,Object> map) {
//        if(map.containsKey("name"))
//        {
//            this.name=(String) (map.get("name"));
//        }
//        if(map.containsKey("age"))
//        {
//            this.age=(int) (map.get("age"));
//        }
//    }
    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder) {
        this.name=builder.getName();
            this.age= builder.getAge();
    }




    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private long id;
        private int gradYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            //all validations can be done here
            return new Student(this);
        }
    }

}
