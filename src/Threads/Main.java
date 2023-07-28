package Threads;

public class Main {
    public static void main(String[] args) {
        Counter c1=new Counter("c1", 1);
        Thread t1=new Thread(c1);
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c1.stop();

        Counter c2=new Counter("c2", 2);
        Thread t2=new Thread(c2);
        t2.start();
        c2.stop();
    }
}
