import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor = in.nextInt();

        switch (valor) {
            case 1:

                System.out.println("Valor digitado foi 1");

                break;
            case 2:
                System.out.println("Valor digitado foi 2");

                break;

            case 3:
                System.out.println("Valor digitado foi 3");

                break;

            default:
                System.out.println("Valor invalido");
        }

        in.close();
    }
}
