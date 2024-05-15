package Streams;

import java.util.ArrayList;
import java.util.List;

public class client  {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,4,6,9,11,13,15,16,103,200,502);
        //List<Integer> evenEle=new ArrayList<>();
//        for(int i=0;i<nums.size();i++)
//        {
//            if(nums.get(i)%2==0)
//                evenEle.add(nums.get(i));
//        }


        List<Integer> evenEle=nums.stream().filter(x->x%2==0).toList();
        System.out.println(evenEle);
    }
}
