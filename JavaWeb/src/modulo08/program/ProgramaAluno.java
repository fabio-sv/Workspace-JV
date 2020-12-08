package modulo08.program;

import modulo08.classes.Aluno;
import modulo08.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramaAluno {

    public static void main(String[] args) {

        // lista de aluno
        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int i = 1; i <= 2; i++) {

            // dados de entrada
            String nome = JOptionPane.showInputDialog("Nome");
            String idade = JOptionPane.showInputDialog("Idade");
            String cpf = JOptionPane.showInputDialog("CPF");

            Aluno aluno1 = new Aluno();

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

        for (int pos = 0; pos < alunos.size(); pos ++){  // size() tamanho da lista

            Aluno aluno = alunos.get(pos);

            if (aluno.getNome().equalsIgnoreCase("Joe")){

                Aluno trocar = new Aluno();
                trocar.setNome("foi torcado");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Java");
                disciplina.setNota(80);

                trocar.getDisciplinas().add(disciplina);

                alunos.set(pos, trocar);
                aluno = alunos.get(pos);

            }

            System.out.println("Aluno " + aluno.getNome());
            System.out.println("Média do aluno " + aluno.getMedia());
            System.out.println("Resultado = " + aluno.getResultadoMedia());

            for (Disciplina disciplina : aluno.getDisciplinas()){
                System.out.println("Disciplina " + disciplina.getDisciplina());
            }

            System.out.println("---------------------------------------------------------------");

        }


    }
}
