package modulo09.classes.exAula;

import modulo08.programaAluno.classes.Aluno;
import modulo08.programaAluno.classes.Disciplina;
import modulo08.programaAluno.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Aplication {
    public static void main(String[] args) {

        // senha para iniciar o programa
        String login = JOptionPane.showInputDialog("Informe o Login");
        String senha = JOptionPane.showInputDialog("Informe a Senha");

        PermitirAcesso secretario = new Secretario();



        // válida a login e senha
        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

            // lista de aluno
            List<modulo08.programaAluno.classes.Aluno> alunos = new ArrayList<modulo08.programaAluno.classes.Aluno>();

            HashMap<String, List<modulo08.programaAluno.classes.Aluno>> map = new HashMap<String, List<modulo08.programaAluno.classes.Aluno>>();

            for (int i = 1; i <= 2; i++) {

                // dados de entrada
                String nome = JOptionPane.showInputDialog("Nome");
                String idade = JOptionPane.showInputDialog("Idade");
                String cpf = JOptionPane.showInputDialog("CPF");

                modulo08.programaAluno.classes.Aluno aluno1 = new modulo08.programaAluno.classes.Aluno();

                aluno1.setNome(nome);
                aluno1.setIdade(Integer.valueOf(idade));
                aluno1.setCpf(cpf);


                //add disciplina
                for (int j = 1; j <= 1; j++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + j + "?");
                    String nota = JOptionPane.showInputDialog("Nota da disciplina " + j + "?");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.valueOf(nota));

                    aluno1.getDisciplinas().add(disciplina);
                }

                // remove disciplina
                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

                int continuarRemover = 0;

                if (escolha == 0) {

                    int posicao = 1;
                    while (continuarRemover == 0) {

                        String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
                        // remove a displina
                        aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                        continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar removendo?");
                        posicao++;
                    }
                }

                alunos.add(aluno1);
            }

            map.put(StatusAluno.Aprovado, new ArrayList<modulo08.programaAluno.classes.Aluno>());
            map.put(StatusAluno.Reprovado, new ArrayList<modulo08.programaAluno.classes.Aluno>());

            // lista todos os alunos e os classifica em duas listas, aprovados e reprovados
            for (modulo08.programaAluno.classes.Aluno aluno : alunos) {

                if (aluno.status().equalsIgnoreCase(StatusAluno.Aprovado)) {
                    map.get(StatusAluno.Aprovado).add(aluno);

                } else if (aluno.status().equalsIgnoreCase(StatusAluno.Reprovado)) {
                    map.get(StatusAluno.Reprovado).add(aluno);

                }

            }

            // imprime a lista de alunos aprovados
            System.out.println("---------------Lista dos Aprovados---------------");
            for (modulo08.programaAluno.classes.Aluno aluno : map.get(StatusAluno.Aprovado)) {
                System.out.println("Aluno = " + aluno.getNome() + ", Nota = " + aluno.getMedia());
            }

            // imprime a lista de alunos reprovados
            System.out.println("---------------Lista dos Reprovados---------------");
            for (Aluno aluno : map.get(StatusAluno.Reprovado)) {
                System.out.println("Aluno = " + aluno.getNome() + ", Nota = " + aluno.getMedia());
            }

        }
    }

}
