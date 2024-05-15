package designpatters.prototypeandregistry;

public class Student implements prototype {
    private int age;
    private String name;
    private String batch;
    private double avgBatchPsp;
    private double studentPsp;

    public Student(){};

    public Student(Student st) {
        this.age = st.age;
        this.name =st.name;
        this.batch = st.batch;
        this.avgBatchPsp =st.avgBatchPsp;
        this.studentPsp = st.studentPsp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
