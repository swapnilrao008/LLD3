package ExectionHandeling;

public class pair {
    String first;
    String second;
    pair(String first,String second){
        if(first==null && second==null)
        {
            throw new RuntimeException("values can't be null");
        }
        this.first=first;
        this.second=second;


    }


}
