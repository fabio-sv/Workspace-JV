package URI;

import java.util.Scanner;

public class uri1072 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] aux = new int[N];
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++){
            aux[i] = scanner.nextInt();
        }

        for (int i = 0; i < aux.length; i++){
            if(aux[i] >= 10 && aux[i] <= 20){
                in = in + 1;
            }
            else if(aux[i] < 10 || aux[i] > 20){
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
