package Exercicios;

public class NumerosPrimos {
    public static void main(String[] args) {

        numerosPrimos(100);

    }

    public static void numerosPrimos(int maxSequencia) {
        int index = 2;
        while (index <= maxSequencia) {

            int div = index / 2;
            boolean check = false;

            for (int i = 2; i <= div; i++) {
                if (index % i == 0) {
                    check = true;
                }
            }
            if (check == false) {
                System.out.println(index);
            }
            index++;
        }

    }
}