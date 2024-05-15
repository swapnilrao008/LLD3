package designpatters.singleton;


import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        DatabaseConnectionV1 db1=new DatabaseConnectionV1();
        DatabaseConnectionV1 db2=new DatabaseConnectionV1();
        //System.out.printf("debug");
        //DatabaseConnectionV2 db3=new DatabaseConnectionV2();
        //DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3 db4=DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3 db5=DatabaseConnectionV3.getInstance();
        System.out.println("debug");

        //for non-threaded
        DatabaseConnectionV4 db6=DatabaseConnectionV4.getInstance();
        DatabaseConnectionV4 db7=DatabaseConnectionV4.getInstance();
        System.out.println("debug");

        //lazy initialisation

        DatabaseConnectionV5 db8=DatabaseConnectionV5.getInstance();
        DatabaseConnectionV5 db9=DatabaseConnectionV5.getInstance();
        System.out.println("debug");
        //with synchronised method

        DatabaseConnectionV6 db10=DatabaseConnectionV6.getInstance();
        System.out.println("debug");
        DatabaseConnectionV7final db11=DatabaseConnectionV7final.getInstance();
        DatabaseConnectionV7final db12=DatabaseConnectionV7final.getInstance();
        System.out.println("debug");







    }
}
