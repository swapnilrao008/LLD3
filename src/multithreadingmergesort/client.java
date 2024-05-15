package multithreadingmergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort=List.of(1,5,4,3,2,8,7,6);
        ExecutorService ex=Executors.newCachedThreadPool();
        mergeSorter ms=new mergeSorter(listToSort,ex);

        Future<List<Integer>> futureList=ex.submit(ms);
        List<Integer> sortedList=futureList.get();
        System.out.println(sortedList);
    }
}
