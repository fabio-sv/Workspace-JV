package EstruturaDados.Interface.ex04;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");

        Validador validador = new Player(login, senha);

        if (new FuncAutentidador(validador).autenticar()){

        }



    }
}
