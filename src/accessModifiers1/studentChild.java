package accessModifiers1;

import accessModifiers.Student;

public class studentChild extends Student {
    public static void main(String[] args) {
        studentChild std =new studentChild();
        Student st=new Student();

        //std.name="swapnil";
        //std.psp=85;
        std.age=26;
        std.batchId=3;
        st.age=25;
        System.out.println("debug");
    }
}
