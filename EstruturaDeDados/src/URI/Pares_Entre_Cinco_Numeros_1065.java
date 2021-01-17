package URI;

import java.util.Scanner;

public class Pares_Entre_Cinco_Numeros_1065 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[5];

        int a = in.nextInt();
        vetor[0] = a;
        int b = in.nextInt();
        vetor[1] = b;
        int c = in.nextInt();
        vetor[2] = c;
        int d = in.nextInt();
        vetor[3] = d;
        int e = in.nextInt();
        vetor[4] = e;

        int cont = 0;

        for (int list : vetor){
            if (list % 2 == 0 ){
                cont = cont + 1;
            }
        }
        System.out.println(cont + " valores pares");
    }
}
