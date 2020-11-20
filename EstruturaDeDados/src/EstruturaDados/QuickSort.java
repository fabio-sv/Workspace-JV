package EstruturaDados;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] x = {1,5,6,7,4,57,84,74};

        quickSort(x);

        for (int i : x){
            System.out.println(i);
        }

    }

    public static void quickSort(int[] vetor){
        quickSort(vetor, 0, vetor.length - 1);

    }

    private static void quickSort(int[] vetor, int inicio, int fim){
        if(inicio < fim){
            // realiza a partição
            int q = particao(vetor, inicio, fim);
            // ordena a partição esquerda
            quickSort(vetor, inicio, q -1);
            // ordena a partição direita
            quickSort(vetor, q + 1, fim);
        }
    }
    private static int particao(int[] vetor, int inicio, int fim){
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j <= fim - 1; j++){
            if(vetor[j] <= pivo){
                i = i + 1;
                swap(vetor, i, j);
            }
        }
        swap(vetor, i + 1, fim);
        return  i + 1;
    }
    private static void swap(int vetor[], int i, int j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

}