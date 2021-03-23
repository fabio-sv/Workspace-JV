package Lambdas.ex06;

public class LambdaEx05 {
    public static void main(String[] args) {

        //Thread sem lambda
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1... ");
            }
        };
        Thread thread1 = new Thread(run1);
        thread1.start();

        //Expressão lambda com Thread
        Runnable run2 = () -> {
            System.out.println("Thread 2...");
        };

        Thread thread2 = new Thread(run2);
        thread2.start();
    }
}
