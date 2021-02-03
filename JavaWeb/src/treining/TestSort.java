package treining;

import javax.swing.*;
import java.sql.ClientInfoStatus;

public class TestSort {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5};

        sort(vetor);

        for (int list : vetor){
            System.out.println(list);
        }

    }
    public static void sort (int[] vetor){

        for (int i = 0; i < vetor.length; i++){

            boolean stop = false;

            for (int j = 0; j < vetor.length; j++){

                if (vetor[i] > vetor[j]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;

                    stop = true;
                }

            }
            if (!stop){

                break;

            }
        }
    }

}
