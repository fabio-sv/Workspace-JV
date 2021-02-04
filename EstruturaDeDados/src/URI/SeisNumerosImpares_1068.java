package URI;

import java.util.Scanner;

public class SeisNumerosImpares_1068 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int cont = 0;

        for (int i = X; i <= X + 100; i++){

            if (i % 2 != 0){
                System.out.println(i);
                cont = cont + 1;

            }
            if (cont == 6){
                break;
            }

        }
    }
}
