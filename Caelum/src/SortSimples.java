public class SortSimples {
    public static void main(String[] args) {

        int[] vetor = {3,2,1,0};

        for (int i = 0; i < vetor.length; i++){

            for (int j = 0; j < vetor.length; j++){

                if (vetor[i] > vetor[j]){

                    int x = vetor[j];
                     vetor[j] = vetor[i];
                     vetor[i] = x;

                    System.out.println(vetor[i] + " meior que " + vetor[j]);

                }

            }
        }
        for ( int i = 0; i < vetor.length; i++){

            //System.out.println(vetor[i]);

        }
    }
}
