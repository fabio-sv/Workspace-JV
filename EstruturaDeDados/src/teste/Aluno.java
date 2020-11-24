package teste;

import java.util.ArrayList;
import java.util.List;

public class Aluno{

    private String nome;

    public Aluno(String nome) {
      this.nome = nome;
    }

    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMedia(){

        double media = 0;
        for (Disciplina disciplina : disciplinas ){
            media =+ disciplina.getNota();

        }
        return media / disciplinas.size();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
