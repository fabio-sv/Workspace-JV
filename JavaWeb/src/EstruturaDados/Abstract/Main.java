package EstruturaDados.Abstract;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Joe");
        aluno.setIdade(20);

        System.out.println(aluno.toString() + " Salario: " + aluno.salario());

        // Aluno{nome='Joe', idade=20} Salario: 1500.0

        teste(aluno);

        // out -> Pessoa: Joe, Salário : 1500.0


    }

    public static void teste (Pessoa pessoa){
        System.out.println("Pessoa: " + pessoa.getNome() + ", Salário : " + pessoa.salario());
    }

}
