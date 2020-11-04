import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor;


        //Valor será pedido ate que se digite "2"
        do{

            valor = in.nextInt();

        }while(valor != 2);

        in.close();
    }
}
