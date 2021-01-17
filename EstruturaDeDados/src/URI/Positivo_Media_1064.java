package URI;

import java.util.Locale;
import java.util.Scanner;

public class Positivo_Media_1064 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        float[] vetor = new float[6];

        float a = in.nextFloat();
        vetor[0] = a;
        float b = in.nextFloat();
        vetor[1] = b;
        float c = in.nextFloat();
        vetor[2] = c;
        float d = in.nextFloat();
        vetor[3] = d;
        float e = in.nextFloat();
        vetor[4] = e;
        float f = in.nextFloat();
        vetor[5] = f;

        int cont = 0;
        float media = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {

                media = media + vetor[i];

                cont = cont + 1;
            }
        }
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media / cont));

    }
}
