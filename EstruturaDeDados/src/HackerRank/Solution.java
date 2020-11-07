package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int[] matriz = {1, 3, 2};
        int aux = 0;

        // array desordenado
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i]);
        }

        System.out.println();


        for (int j = 0; j < 2; j++) {
            if (matriz[j] > matriz[j + 1]) {
                aux = matriz[j];
                matriz[j] = matriz[j + 1];
                matriz[j + 1] = aux;

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);
        }


    }

}
