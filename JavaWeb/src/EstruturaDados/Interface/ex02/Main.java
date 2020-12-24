package EstruturaDados.Interface.ex02;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Secretario secretario = new Secretario(); // cria o objeto secretario

        String recebeLogin = JOptionPane.showInputDialog("Login:"); // recebe do usuário seu login
        String recebeSenha = JOptionPane.showInputDialog("Senha:"); // recebe do usuário sua senha

        secretario.autenticar(recebeLogin, recebeSenha); // passa por argumento login e senha para o método autenticar


        if (secretario.autenticar(recebeLogin, recebeSenha)){ // verifica se login e senha são true ou false
            JOptionPane.showMessageDialog(null, "Acesso liberado!"); // executa caso for true
        }else {
            JOptionPane.showMessageDialog(null, "Acesso negado!"); // executa caso for false
        }

    }
}
