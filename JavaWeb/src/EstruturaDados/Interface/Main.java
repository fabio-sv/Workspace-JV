package EstruturaDados.Interface;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jane");
        aluno1.setIdade(20);
        aluno1.setLogin("abcd");
        aluno1.setSenha("abcd");

        System.out.println(aluno1.toString()); // Aluno{nome='Jane', idade=20}
        System.out.println(aluno1.acesso()); // false

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Jhon");
        aluno2.setIdade(25);
        aluno2.setLogin("admim");
        aluno2.setSenha("admim");

        System.out.println(aluno2.toString()); // Aluno{nome='Jhon', idade=25}
        System.out.println(aluno2.acesso()); // true
    }
}
