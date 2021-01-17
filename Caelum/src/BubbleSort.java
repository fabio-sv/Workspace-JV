public class BubbleSort {
    public static void main(String[] args) {

        int[] score = {60, 50, 95, 80, 70};

        sort(score); // chamada do método

        for (int i = 0; i < score.length; i++) {

            System.out.println(score[i]);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            boolean isSwap = false;

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isSwap = true;
                }
            }
            if (!isSwap) { // nenhuma troca então encerre a ordenação
                System.out.println("Dentro isSwap");
                break;
            }
        }
    }
}
