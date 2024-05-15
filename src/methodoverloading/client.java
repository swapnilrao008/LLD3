package methodoverloading;

public class client {
    public static void main(String[] args) {
        Student st=new Student();
        st.hello();
        st.hello("swapnil");
        System.out.println("debug");
    }
}
