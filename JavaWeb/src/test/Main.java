package test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();


        for (int i = 0; i < 3; i++) {

            Aluno aluno = new Aluno();
            String nome = JOptionPane.showInputDialog("Nome");
            aluno.setNome(nome);
            String idade = JOptionPane.showInputDialog("Idade");
            aluno.setIdade(Integer.parseInt(idade));

            alunos.add(aluno);

        }

        for (Aluno aluno : alunos){

            int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir algum da lista");

            if (excluir == 0){
                String nome = JOptionPane.showInputDialog("Nome");
                if (aluno.getNome().equalsIgnoreCase(nome)){
                    alunos.remove(nome);
                }

            }
            System.out.println(aluno.toString());
        }

    }

}
