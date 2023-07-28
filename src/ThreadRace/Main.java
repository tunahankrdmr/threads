package ThreadRace;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static ArrayList<Integer> numbers=new ArrayList<>();
    public static void main(String[] args) {
        Threads numThreads=new Threads();
        ExecutorService pool= Executors.newFixedThreadPool(4);
        for (int i=0; i<40; i++){
            numbers.add(i);
        }
        for (int i=0; i<numbers.size(); i++){
            pool.execute(numThreads);
        }
        pool.shutdown();
    }
}
