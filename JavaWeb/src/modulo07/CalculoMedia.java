package modulo07;

import javax.swing.*;

public class CalculoMedia {
    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
        String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
        String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
        String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

        double valor1 = Double.parseDouble(nota1);
        double valor2 = Double.parseDouble(nota2);
        double valor3 = Double.parseDouble(nota3);
        double valor4 = Double.parseDouble(nota4);

        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        if (media >= 0 && media <= 100) {
            if (media >= 50) {
                JOptionPane.showMessageDialog(null, "A média é: " + media + " você foi Aprovado.");

            } else if (media < 50) {
                JOptionPane.showMessageDialog(null, "A média é: " + media + " você foi Reprovado.");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação invalida");

        }


    }
}
