package Secao4;

import java.util.Scanner;

public class QuebraDeLinha {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        in.nextLine(); //consome a linha que ficou pendente
        String b = in.nextLine();
        String c = in.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        in.close();
    }
}
