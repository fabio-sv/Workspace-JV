package URI;

import java.util.Scanner;

public class Pares_Impares_Positivos_Negativos_1066 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[5];

        vetor[0] = in.nextInt();
        vetor[1] = in.nextInt();
        vetor[2] = in.nextInt();
        vetor[3] = in.nextInt();
        vetor[4] = in.nextInt();

        int par = 0;
        int impar = 0;
        int positivos = 0;
        int negativos = 0;

        for (int list : vetor) { // par
            if (list % 2 == 0) {
                par = par + 1;

            } if (list % 2 != 0) {
                impar = impar + 1;

            } if (list > 0) {
                positivos = positivos + 1;

            } if (list < 0){
                negativos = negativos + 1;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");


    }

}
