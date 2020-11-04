package metodoConstrutor2;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;

        System.out.println("Nome: " + this.nome + " , " + "Mat. " + this.matricula);

    }
}
