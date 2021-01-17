public class teste {
    public static void main(String[] args) {

        int[] vetor = {7, -1, 3, 59, 80};

        insertSort(vetor);

        for (int sort : vetor){
            System.out.println(sort);
        }

    }
    public static void insertSort (int[] vetor){
        for (int i = 0; i < vetor.length - 1; i++){
            int index = i;

            for (int j = i + 1; j < vetor.length; j ++){

                if (vetor[index] > vetor[j]){
                    index = j;
                }
            }
            if(i != index){
                int aux = vetor[i];
                vetor[i] = vetor[index];
                vetor[index] = aux;
            }
        }
    }
}
