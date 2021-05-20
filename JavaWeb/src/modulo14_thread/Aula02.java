package modulo14_thread;

public class Aula02 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++){

            //Executa a cada 2 segundos
            Thread.sleep(2000);
            System.out.println("Executando alguma rotina");
        }
    }
}
