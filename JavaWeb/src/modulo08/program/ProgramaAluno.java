package modulo08.program;

import modulo08.classes.Aluno;
import modulo08.classes.Disciplina;

import javax.swing.*;

public class ProgramaAluno {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome");
        String idade = JOptionPane.showInputDialog("Idade");
        String cpf = JOptionPane.showInputDialog("CPF");

        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setCpf(cpf);

        for (int i = 1; i <= 4; i++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + i + "?");
            String nota = JOptionPane.showInputDialog("Nota da disciplina " + i + "?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(nota));

            aluno1.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

        if (escolha == 0){
            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
            // remove a displina
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
        }


       JOptionPane.showMessageDialog(null,"Média final " + aluno1.getMedia()
               + ". Aluno(a) " + aluno1.getNome() + " está " + aluno1.getResultadoMedia() + "!" );

        System.out.println(aluno1.toString());

    }
}
