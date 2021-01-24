package EstruturaDados.Interface.ex03;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome");
        String idade = JOptionPane.showInputDialog("Idade");
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");

        Validar validar = new  Aluno(login, senha); // passando login e senha por argumento

        // se login e senha for true
        if (validar.autenticar()){
            JOptionPane.showMessageDialog(null, "Acesso permitido");

        }

        // se login e senha for false
        else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }

    }
}
