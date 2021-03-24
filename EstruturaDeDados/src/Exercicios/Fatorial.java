package Exercicios;

public class Fatorial {
    public static void main(String[] args) {

        fatorial(3);

    }

    public static void fatorial(int valor) {
        int fatorial = 1;
        for (int i = valor; i > 1; i--) {
            int temp = i;
            fatorial *= temp;
        }
        System.out.println(fatorial);
    }
}
