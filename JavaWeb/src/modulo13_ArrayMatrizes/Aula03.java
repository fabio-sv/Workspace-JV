package modulo13_ArrayMatrizes;

public class Aula03 {
    public static void main(String[] args) {

        double[] notas = new double[4];

        notas[0] = 7.8;
        notas[1] = 8.7;
        notas[2] = 9.7;
        notas[3] = 9.9;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
        }
    }
}
