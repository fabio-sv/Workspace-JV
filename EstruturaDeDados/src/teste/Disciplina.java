package teste;

public class Disciplina {

    private String nome;
    private int nota;

    public Disciplina(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
