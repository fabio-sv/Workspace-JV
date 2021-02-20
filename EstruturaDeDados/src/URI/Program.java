package URI;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int N; // quantidade de imoveis
        //int X; // quantidade de moradores de cada imovel
        //int Y; // consumo em m³

        Scanner input = new Scanner(System.in);

        N = input.nextInt();


        for (int i = 1; i <= N; i++){
            int X = input.nextInt(), Y = input.nextInt();
            int[] vetorX  = {X};

        }






    }
    public static void func(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }

        }


    }
}
