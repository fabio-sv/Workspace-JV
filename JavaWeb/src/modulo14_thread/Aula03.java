package modulo14_thread;

import javax.swing.*;

public class Aula03 {
    public static void main(String[] args) throws InterruptedException {

        new Thread() {

            public void run() {

                //Código que vai rodar em paralelo
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Executando alguma rotina");
                }
            }
        }.start(); //Start liga a thread que fica por trás

        //Código do sistema do usuário continua o fluxo de trabalho
        System.out.println("Chegou ao fim");
        JOptionPane.showMessageDialog(null, "Sistema continua executanto para o usuário");
    }
}
