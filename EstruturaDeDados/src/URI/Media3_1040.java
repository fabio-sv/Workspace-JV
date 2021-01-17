package URI;

import java.util.Locale;
import java.util.Scanner;

public class Media3_1040 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

       float valor = mediaPonderada(n1, n2, n3, n4);

        System.out.println("Media: " + String.format("%.1f", valor));

        if (valor >= 7.0){
            System.out.println("Aluno aprovado.");

        } else if (valor < 5.0){
            System.out.println("Aluno reprovado.");

        } else if (valor >= 5.0 && valor <= 6.9){
            System.out.println("Aluno em exame.");

            float notaExame = scanner.nextFloat();
            System.out.println("Nota do exame: " + notaExame );

            float valorExame = recalcularMedia(notaExame, valor);

            if (valorExame >= 5.0){
                System.out.println("Aluno aprovado.");

                System.out.println("Media final: " + valorExame);

            } else if (valorExame <= 4.9){
                System.out.println("Aluno reprovado.");

                System.out.println("Media final: " + valorExame);

            }

        }


        scanner.close();
    }
    public static float mediaPonderada (float n1, float n2, float n3, float n4){
        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (1 + 2 + 3 + 4);

        return media;
    }
    public static float recalcularMedia(float notaExame, float valor) {
        float media = (notaExame + valor) / 2;

        return media;

    }
}
