package URI;

public class Sort_Simples {
    public static void main(String[] args) {

        int[] vetor = {1, 3, 2};

        for (int j = 0; j < vetor.length; j++) {

            for (int i = 0; i < vetor.length - 1; i++) {

                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;

                }

            }

        }

        for (int i : vetor) {
            System.out.println(i);

        }


    }
}
