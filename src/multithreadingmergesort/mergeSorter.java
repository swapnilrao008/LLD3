package multithreadingmergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService ex;
    mergeSorter(List<Integer> listToSort,ExecutorService ex){
        this.listToSort=listToSort;
        this.ex=ex;
    }
    @Override
    public List<Integer> call() throws Exception {
        System.out.println("sorted by thread :"+Thread.currentThread().getName());
        int size=listToSort.size();
        if (size<=1)
            return listToSort;

        List<Integer> firstHalf=new ArrayList<>();
        List<Integer> secondHalf=new ArrayList<>();
        for(int i=0;i<size/2;i++)
        {
             firstHalf.add(listToSort.get(i));
        }
        for(int i=size/2;i<size;i++)
        {
            secondHalf.add(listToSort.get(i));
        }
        mergeSorter leftMergeSorter=new mergeSorter(firstHalf,ex);
        mergeSorter rightMergeSorter=new mergeSorter(secondHalf,ex);
        //ExecutorService ex= Executors.newCachedThreadPool();

        Future<List<Integer>> sortedLeftHalfFuture=ex.submit(leftMergeSorter);
        Future<List<Integer>> sortedRighttHalfFuture=ex.submit(rightMergeSorter);
        List<Integer> sortedLeftHalf=sortedLeftHalfFuture.get();
        List<Integer> sortedRighttHalf=sortedRighttHalfFuture.get();
        int i=0,j=0;
        List<Integer> sortedList=new ArrayList<>();
        while(i<sortedLeftHalf.size() && j<sortedRighttHalf.size())
        {
            if(sortedLeftHalf.get(i)<sortedRighttHalf.get(j)) {
                sortedList.add(sortedLeftHalf.get(i));
                i++;
            }
            else {
                sortedList.add(sortedRighttHalf.get(j));
                j++;
            }
        }
        while (i<sortedLeftHalf.size())
        {
            sortedList.add(sortedLeftHalf.get(i));
            i++;
        }
        while (j<sortedRighttHalf.size())
        {
            sortedList.add(sortedRighttHalf.get(j));
            j++;
        }


        return sortedList;
    }
}
