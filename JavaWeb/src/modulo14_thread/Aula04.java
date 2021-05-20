package modulo14_thread;

import javax.swing.*;

public class Aula04 {
    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {

                try {
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(3000);
                        System.out.println("Envio de e-mail");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(3500);
                        System.out.println("Envio de nota fiscal");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        JOptionPane.showMessageDialog(null, "Sistema rodando!");
    }
}
