package EqualsHascode;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Jones");
        aluno1.setCpf("055.854.864.90");

        Aluno aluno2 = new Aluno();

        aluno2.setNome("Jones");
        aluno2.setCpf("055.854.864.80");

        // Aluno 1 é igual ao Aluno 2 ?
        if (aluno1.equals(aluno2)){
            System.out.println("Iguais");

        }else {
            System.out.println("Diferentes");

        }
        // output Diferentes

    }
}
