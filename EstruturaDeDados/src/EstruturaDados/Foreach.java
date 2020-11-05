import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {


        //For aplicado  em Array
        List<Integer> valor = Arrays.asList(1, 2, 3, 4, 5);

        for (Integer i : valor){
            System.out.println(i);
        }

        System.out.println();


        //For aplicado em Array
        int[] number = new int[]{1, 2, 3, 4, 5};

        for (int i : number){
            System.out.println(i);
        }

        System.out.println();


        //For aplicado em Array Multidimensional
        int[][] bidimencional = new int[2][2];

        for (int[] i : bidimencional){
            for (int j : i){
                System.out.println(i);

            }

        }

    }

}
