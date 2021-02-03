public class teste {
    public static void main(String[] args) {

        int[] vetor = {3, 2, 1, 8, 5, 9};

        sort(vetor);

        for (int list : vetor){
            System.out.println(list);
        }


    }
    public static void sort (int[] vetor){
        for (int i = 0; i < vetor.length - 1; i++){

            int index = i;

            for (int j = i + 1; j < vetor.length; j++){

                if (vetor[index] > vetor[j]){
                    index = j;

                }
            }
            if (i != index){
                int aux = vetor[i];
                vetor[i] = vetor[index];
                vetor[index] = aux;

            }
        }
    }

}
