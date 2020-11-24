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
            String nomeDisciplina = JOptionPane.showInputDialog("Disciplina " + i);
            String nota = JOptionPane.showInputDialog("Nota");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Integer.valueOf(nota));

            aluno1.getDisciplinas().add(disciplina);
        }

        System.out.println(aluno1.toString());

       JOptionPane.showMessageDialog(null,"Media " + aluno1.getMedia() + " " + aluno1.getResultadoMedia() );





    }
}
