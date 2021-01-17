public class SelectSort {
    public static void main(String[] args) {

        int[] scores = {60, 80, 95, 50, 70};

        sort(scores);

        for (int score : scores){
            System.out.println(score);
        }

    }
    public static void sort (int[] arrays){
        for (int i = 0; i < arrays.length - 1; i ++){
            int minIndex = i;

            for (int j = i + 1; j < arrays.length; j++){

                if (arrays[minIndex] > arrays[j]){
                    minIndex = j;
                }
            }
            if (i != arrays[minIndex]){
                int temp = arrays[i];
                arrays[i] = arrays[minIndex];
                arrays[minIndex] = temp;
            }
        }
    }
}

