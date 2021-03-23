package Exercicios;

public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(10);

    }

    public static void fibonacci(int sequenciaMaxima) {

        int[] vetor = new int[sequenciaMaxima];

        for (int i = 0; i < vetor.length; i++) {

            if (i < 2) {
                vetor[i] = i;
            } else {
                vetor[i] = vetor[i - 1] + vetor[i - 2];
            }

            System.out.print(vetor[i] + ", ");

            //Saída:: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

        }
    }
}
