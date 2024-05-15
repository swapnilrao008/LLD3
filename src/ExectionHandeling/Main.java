package ExectionHandeling;

public class Main {
    public static void main(String[] args) {
        pair p1=new pair("SWAPNIL","Rao");

        try{
            pair p2=new pair(null,null);
            System.out.println(p2.first+"."+p2.second);
        }
        catch (RuntimeException ex)
        {
            System.out.println("null values not allowed");
        }
        finally {
            System.out.println("clean up activites can be done using this block");
        }

        System.out.println(p1.first+"."+p1.second);

    }
}
