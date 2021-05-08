package modulo13_ArrayMatrizes;

import javax.swing.*;

public class Aula04 {
    public static void main(String[] args) {

        String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int i = 0; i < notas.length; i++) {
            String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + i);
            notas[i] = Double.parseDouble(valor);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posição " + i + " = " + notas[i]);
        }

    }
}
