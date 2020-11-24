package ListaGenerica;

public class Program {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Jone");
        aluno.setCpf("854.842.365.40");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Banco de dados");
        disciplina1.setNota((byte) 80);
        aluno.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Algoritmos");
        disciplina2.setNota((byte) 80);
        aluno.getDisciplinas().add(disciplina2);

        System.out.println(aluno.getMedia());
        System.out.println(aluno.toString());


    }
}
