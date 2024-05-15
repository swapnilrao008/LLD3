package designpatters.prototypeandregistry;

public class App {
    public static void main(String[] args) {
        studentRegistry str=new studentRegistry();
        fillRegistry(str);
        Student swapnil=str.get("aprilBatch").clone();
        swapnil.setAge(26);
        swapnil.setStudentPsp(89.0);
        swapnil.setName("Swapnil");

        Student balaji=str.get("aprilBatchintellijStudent").clone();
        balaji.setName("Balaji");
        balaji.setAge(25);
        balaji.setStudentPsp(92);

        System.out.println("swapnil:"+swapnil);
        System.out.println("Balaji"+balaji);
    }

    private static void fillRegistry(studentRegistry str) {
        Student aprilBatchStudent=new Student();
        aprilBatchStudent.setAge(27);
        aprilBatchStudent.setBatch("Apr 23");
        aprilBatchStudent.setAvgBatchPsp(90.0);

        str.register("aprilBatch",aprilBatchStudent);
        intellijStudent aprilBatchIntellijStudent = new intellijStudent();
        aprilBatchIntellijStudent.setIq(300);
        aprilBatchIntellijStudent.setBatch("Apr 23");
        aprilBatchIntellijStudent.setAvgBatchPsp(95.0);
        str.register("aprilBatchintellijStudent",aprilBatchIntellijStudent);


    }
}
