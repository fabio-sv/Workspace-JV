package teste;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome");
        Aluno aluno = new Aluno(nome);

        for (int i = 1; i <= 4; i++){
            String nomeDis = JOptionPane.showInputDialog("Disciplina");
            String valor = JOptionPane.showInputDialog("Nota");
            int nota = Integer.valueOf(valor);

            Disciplina disciplina = new Disciplina(nomeDis, nota);
            aluno.getDisciplinas().add(disciplina);

        }

        JOptionPane.showMessageDialog(null, aluno.toString());


    }
}
