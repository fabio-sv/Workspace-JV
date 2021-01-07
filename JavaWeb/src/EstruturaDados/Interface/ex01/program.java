package EstruturaDados.Interface.ex01;

import javax.swing.*;

public class program {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(); // validação feita através do próprio objeto aluno

        String login = JOptionPane.showInputDialog("Login");
        aluno.setLogin(login);
        String senha = JOptionPane.showInputDialog("Senha");
        aluno.setSenha(senha);

        if (aluno.validar()){
            System.out.println("Senha e login são verdadeiros");

        }else {
            System.out.println("Senha e login são falsos");
        }


    }
}
