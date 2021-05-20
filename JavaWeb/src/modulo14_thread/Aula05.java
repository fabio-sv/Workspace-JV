package modulo14_thread;

public class Aula05 {
    public static void main(String[] args) {

        //Trasnformando as threads em objetos
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        Thread threadNotaFiscal = new Thread(thread2);
        threadNotaFiscal.start();
    }

    private static Runnable thread1 = new Runnable() {
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
    };

    private static Runnable thread2 = new Runnable() {
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
    };
}
