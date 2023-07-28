package CriticalSection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic=new OrderMatic();
        ExecutorService pool= Executors.newFixedThreadPool(3);
        for (int i=0; i<15; i++){
            pool.execute(oMatic);
        }
    }
}
