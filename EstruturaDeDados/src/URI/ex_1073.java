package URI;

import java.util.Scanner;

public class ex_1073 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        pararesQuadrados(N);

        scanner.close();

    }
    public static void pararesQuadrados(int n){
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i + "^" + "2" + " = " + (i * i));
            }
        }
    }
}
