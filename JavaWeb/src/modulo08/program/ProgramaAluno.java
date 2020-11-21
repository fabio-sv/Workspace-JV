package modulo08.program;

import modulo08.classes.Aluno;

import javax.swing.*;

public class ProgramaAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jone");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Jone");

        if (aluno1.equals(aluno2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }


    }
}
