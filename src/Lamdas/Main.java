package Lamdas;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newCachedThreadPool();
        Future<String> f= ex.submit(()->{return "scaler from lamdas";});
        System.out.println(f.get());
    }
}
