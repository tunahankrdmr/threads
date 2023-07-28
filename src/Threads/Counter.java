package Threads;

public class Counter implements Runnable{
    private String name;
    private int id;
    private boolean isRun=true;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.name + " Çalıştı!!");
        int i=0;
        while (isRun){
            try {
                Thread.sleep(1000l * this.id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name+ " : " + i++);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop(){
        this.isRun=false;
    }
}
