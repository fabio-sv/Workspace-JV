package LambdaExpressoes.ex01;

interface Medida {

    public void run();

}

public class LambdaEx01 {
    public static void main(String[] args) {

        int valor = 10;

        //Expressão lambda
        Medida media = () -> {

            System.out.println("Medida = " + valor);
        };

        media.run();

        //Saída:: Medida 10

    }
}
