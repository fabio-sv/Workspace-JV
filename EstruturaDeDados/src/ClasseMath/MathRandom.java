package ClasseMath;

public class MathRandom {
    public static void main(String[] args) {

        // imprime um valor aleatório entre 1 e 100
        int valor = (int)(Math.random() * 100) + 1;
        System.out.println(valor);

        // imprime um valor entre 1.0 e 100.0
        double valor2 = (double) (Math.random() * 100) + 1;
        System.out.println(valor2);
    }
}
