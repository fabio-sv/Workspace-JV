import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        float x = in.nextFloat();
        float y = in.nextFloat();


        if ( x > 0 && y > 0){
            System.out.println("Q1");
        }

        if (x < 0 && y > 0){
            System.out.println("Q2");
        }

        if (x < 0 && y < 0){
            System.out.println("Q3");
        }

        if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        if (x != 0 && y == 0){
            System.out.println("Eixo X");
        }

        if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }

        in.close();
    }
}
