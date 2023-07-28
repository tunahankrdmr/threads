package ThreadRace;

import java.util.ArrayList;

public class Threads implements Runnable{
    private int number;
    private ArrayList<Integer> oddList;
    private ArrayList<Integer> evenList;

    public Threads() {
        this.number = 0;
        this.oddList=new ArrayList<>();
        this.evenList=new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
            increaseThread();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public synchronized void increaseThread(){
        if (number%2==0){
            System.out.println(Thread.currentThread().getName() + " - even listesine eklendi!! " + this.number);
            evenList.add(this.number);
            printEvenList();
            this.number++;
        }else {
            System.out.println(Thread.currentThread().getName() + " - odd listesine eklendi!! " + this.number);
            oddList.add(this.number);
            printOddList();
            this.number++;
        }
    }

    public void printEvenList(){
        System.out.println("---------------------");
        System.out.println("Çift sayılar");
        System.out.println("---------------------");
        for (Integer i : evenList){
            System.out.println(i);
        }
    }

    public void printOddList(){
        System.out.println("---------------------");
        System.out.println("Tek sayılar");
        System.out.println("---------------------");
        for (Integer i : oddList){
            System.out.println(i);
        }
    }
}
