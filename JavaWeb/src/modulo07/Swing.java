package modulo07;

import javax.swing.*;

public class Swing {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        String sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome");

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja salvar?");

        if (resposta == 0 ){
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "" + sobrenome);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não salvo");
        }

    }
}
