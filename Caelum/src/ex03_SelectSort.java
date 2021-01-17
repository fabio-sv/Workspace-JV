public class ex03_SelectSort {
    public static void main(String[] args) {

        int[] scores = {60, 80, 95, 50, 70};

        sort(scores); // chamada do método sort

        for (int score : scores){
            System.out.println(score);
        }
    }
    public static void sort (int[] arrays){

        for (int i = 0; i < arrays.length - 1; i++){
            int minInex = i;

            for (int j = i + 1; j < arrays.length; j ++){

                if (arrays[minInex] > arrays[j]){
                    minInex = j;
                }
            }
            if (i != minInex){
                int temp = arrays[i];
                arrays[i] = arrays[minInex];
                arrays[minInex] = temp;
            }
        }
    }
}

