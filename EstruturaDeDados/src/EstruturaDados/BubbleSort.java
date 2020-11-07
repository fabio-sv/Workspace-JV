package EstruturaDados;

public class BubbleSort {
    public static void main(String[] args) {

        int[] x = {-50, -1, 5, 30};
        int max = 0;

        // cálcula a quantidade de elemento do vetor
        for(int i = 0; i < x.length; i++){
            max = i + 1;
        }

        // percorre o vetor
        for(int j = 0; j < x.length; j++) {
            // compara os valores da posição anterior com a posterior
            for (int i = 0; i < (max - 1); i ++){
                if (x[i] > x[i + 1]){
                    int aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }

        // imprime o vetor ordenado pelo bubble sort
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
