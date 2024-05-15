package constructors;

public class student {
    String name;
    int age;
    double psp;
    String batchName;
    student(String name1,int age,double psp,String batchName)
    {
        this.age=age;
        name=name1;
        this.psp=psp;
        this.batchName=batchName;
    }
    student(){};

    student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public student(student st)
    {
        this.name=st.name;
        this.age=st.age;
        this.batchName=st.batchName;
        this.psp=st.psp;



    }
}
