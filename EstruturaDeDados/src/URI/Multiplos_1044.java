package URI;

import java.util.Scanner;

public class Multiplos_1044 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > B) {
            int mult = A % B;

            if (mult == 0) {
                System.out.println("Sao Multiplos");

            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if (A < B) {
            int mult = B % A;

            if (mult == 0) {
                System.out.println("Sao Multiplos");

            } else {
                System.out.println("Nao sao Multiplos");
            }

        }
    }
}
