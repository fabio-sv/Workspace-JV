package modulo13_ArrayMatrizes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

class Aluno extends Disciplina {

    private String nome;

    ArrayList<Disciplina> disciplinasList = new ArrayList<Disciplina>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinasList() {
        return disciplinasList;
    }

    public void setDisciplinasList(ArrayList<Disciplina> disciplinasList) {
        this.disciplinasList = disciplinasList;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", disciplinasList=" + disciplinasList +
                '}';
    }
}

class Disciplina {

    private String disciplina;
    private double[] notas = new double[4];

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMediaNotas() {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / 4;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplina='" + disciplina + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", Media= " + getMediaNotas() + '}';
    }
}

public class Aula06 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        String nome = JOptionPane.showInputDialog("Nome do aluno");
        aluno.setNome(nome);

        for (int i = 0; i < 2 ; i++){
            Disciplina disciplina = new Disciplina();
            String disc = JOptionPane.showInputDialog("Disciplina");
            disciplina.setDisciplina(disc);

            double[] aux = new double[4];
            for( int j = 0; j < 4; j++){
                String nota = JOptionPane.showInputDialog("Nota" + (j + 1));
                aux[j] = Double.parseDouble(nota);

                disciplina.setNotas(aux);
            }
            aluno.getDisciplinasList().add(disciplina);

        }
        System.out.println(aluno.toString());
    }

}

