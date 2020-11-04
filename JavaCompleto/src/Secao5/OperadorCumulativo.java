package Secao5;

public class OperadorCumulativo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 10;
        int d = 20;

        a = a + b; // atribuição simples
        c += d; // atribuição cumulativa

        System.out.println(a);
        System.out.println(c);
    }
}
