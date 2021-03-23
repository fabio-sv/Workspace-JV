package Exercicios;

import java.util.ArrayList;

public class NumerosPrimos {
    public static void main(String[] args) {

        numerosPrimos(4);

    }

    public static void numerosPrimos(int valor) {

        int div = valor / 2;
        boolean aux = false;

        for (int i = 1; i <= div; i++) {
            if (valor % i == 0) {
                System.out.println(i);
            }

        }


    }
}