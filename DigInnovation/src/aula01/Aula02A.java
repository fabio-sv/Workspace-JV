package aula01;

import java.util.Arrays;

public class Aula02A {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4};

        //paradigma funcional
        Arrays.stream(vetor)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

        //paradigma imperativo
        for (int i = 0; i < vetor.length; i++){
            int valor;
            if (vetor[i] % 2 == 0){
                valor = i * 2;

                if (valor != 0){
                    System.out.println(valor);
                }
            }
        }
    }
}
