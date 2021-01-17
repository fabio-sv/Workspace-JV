package URI;

import java.util.Scanner;

public class Sort_Simples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[3];

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        vetor[0] = a;
        vetor[1] = b;
        vetor[2] = c;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int sort : vetor) {
            System.out.println(sort);
        }

        System.out.println();

        System.out.println(vetor[0] = a);
        System.out.println(vetor[1] = b);
        System.out.println(vetor[2] = c);

        scanner.close();


    }

}
