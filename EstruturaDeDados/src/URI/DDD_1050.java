package URI;

import java.util.Scanner;

public class DDD_1050 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ddd = scanner.nextInt();

        int[] vetor = {61, 71, 11, 21, 32, 19, 27, 31};

        boolean valida = false;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == ddd){
                switch (ddd){
                    case 61:
                        System.out.println("Brasilia");
                        valida = true;
                        break;

                    case 71:
                        System.out.println("Salvador");
                        valida = true;
                        break;

                    case 11:
                        System.out.println("Sao Paulo");
                        valida = true;
                        break;

                    case 21:
                        System.out.println("Rio de Janeiro");
                        valida = true;
                        break;

                    case 32:
                        System.out.println("Juiz de Fora");
                        valida = true;
                        break;

                    case 19:
                        System.out.println("Campinas");
                        valida = true;
                        break;

                    case 27:
                        System.out.println("Vitoria");
                        valida = true;
                        break;

                    case 31:
                        System.out.println("Belo Horizonte");
                        valida = true;
                        break;
                }
            }
        }
        if (valida != true){
            System.out.println("DDD nao cadastrado");

        }

    }
}
