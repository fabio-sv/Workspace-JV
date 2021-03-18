package Threads;

class Mythread implements Runnable{

    private String name;
    private int time;

    public Mythread(String name, int time){
        this.name= name;
        this.time = time;

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                System.out.println(name + " " + i);

                Thread.sleep(time);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

public class Threads {
    public static void main(String[] args) {

        Mythread mythread1 = new Mythread("Counter 1: ", 400);
        Mythread mythread2 = new Mythread("Counter 2: ", 800);

    }
}
