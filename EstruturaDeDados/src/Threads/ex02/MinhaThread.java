package Threads.ex02;

public class MinhaThread implements Runnable {

    //Threads
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread thread = new Thread(this); // this faz referência ao próprio obj thread
        thread.start(); // start
    }

    @Override
    public void run() { //running

        try {

            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);

                Thread.sleep(tempo); // sleep
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Terminou a execução"); // dead

    }
}
