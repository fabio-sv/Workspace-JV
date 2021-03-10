package Threads.ex01;

public class Threads01 extends Thread {

    private String nome;
    private int tempo;

    public Threads01(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start(); // start

    }
    public void run() { // running

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador" + i);

                Thread.sleep(tempo); //sleep
            }
            System.out.println("Dead da Thread"); // dead

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
