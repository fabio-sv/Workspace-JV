package URI;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Tipo_Triangulo_1045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[] vetor = new float[3];

        float A = scanner.nextFloat();
        vetor[0] = A;
        float B = scanner.nextFloat();
        vetor[1] = B;
        float C = scanner.nextFloat();
        vetor[2] = C;

        sort(vetor);
        A = vetor[2];
        B = vetor[1];
        C = vetor[0];

        boolean x = false;
        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");

            x = true;

        } if ((A * A) == (B * B + (C * C))){
            System.out.println("TRIANGULO RETANGULO");

        } if ((A * A) > (B * B + (C * C)) && x == false){
            System.out.println("TRIANGULO OBTUSANGULO");

        } if ((A * A) < (B * B + (C * C))){
            System.out.println("TRIANGULO ACUTANGULO");

        } if (A == B && A == C && B == C){
            System.out.println("TRIANGULO EQUILATERO");

        } if (A == B && A != C || A == C && A != B || B == C && B != A){
            System.out.println("TRIANGULO ISOSCELES");

        }
    }
}
