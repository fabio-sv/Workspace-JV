package test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Aluno> alunosLista = new ArrayList<Aluno>();

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar alunos?");
        switch (escolha) {
            case 0:

                // adiciona na lista
                for (int i = 0; i < 2; i++) {

                    Aluno alunoNovo = new Aluno();

                    String addNome = JOptionPane.showInputDialog("Nome");
                    String addIdade = JOptionPane.showInputDialog("Idade");

                    alunoNovo.setNome(addNome);
                    alunoNovo.setIdade(Integer.parseInt(addIdade));

                    alunosLista.add(alunoNovo);

                }

                // remove elementos da lista
                int remover = JOptionPane.showConfirmDialog(null, "Remover");

                if (remover == 0) {
                    String removerPessoa = JOptionPane.showInputDialog("Remover pessoa da lista");

                    for (int i = 0; i < alunosLista.size(); i++) {
                        Aluno aluno = alunosLista.get(i);

                        if (aluno.getNome().equalsIgnoreCase(removerPessoa)) {
                            alunosLista.remove(i);
                        }
                    }

                }

                // imprime lista
                for (int i = 0; i < alunosLista.size(); i++) {
                    System.out.println(alunosLista.get(i));

                }

            case 1:
                break;
        }

    }
}
