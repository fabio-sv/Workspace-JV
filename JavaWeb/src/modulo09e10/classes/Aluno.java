package modulo09e10.classes;

import modulo08.programaAluno.classes.Disciplina;
import modulo08.programaAluno.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMedia() {

        double media = 0;
        for (Disciplina disciplina : disciplinas) {
            media = media + disciplina.getNota();
        }
        return media / disciplinas.size();

    }

    // este método retorna o status do aluno
    public String status() {

        if (getMedia() >= 50 && getMedia() <= 100) {
            return StatusAluno.Aprovado;

        } else if (getMedia() < 50 && getMedia() > 0) {
            return StatusAluno.Reprovado;

        } else {
            return StatusAluno.Erro;

        }

    }


    public String getNome() {
        return super.nome;
    }

    public void setNome(String nome) {
        super.nome = nome;
    }

    public int getIdade() {
        return super.idade;
    }

    public void setIdade(int idade) {
        super.idade = idade;
    }

    public String getCpf() {
        return super.numeroCPF;
    }

    public void setCpf(String cpf) {
        super.numeroCPF = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aluno aluno = (Aluno) o;
        return disciplina.equals(aluno.disciplina) && disciplinas.equals(aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), disciplina, disciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }
}
