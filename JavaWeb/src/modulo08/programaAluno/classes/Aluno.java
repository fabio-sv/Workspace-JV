package modulo08.programaAluno.classes;


import modulo08.programaAluno.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    private String nome;
    private int idade;
    private String cpf;

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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade &&
                nome.equals(aluno.nome) &&
                cpf.equals(aluno.cpf) &&
                disciplinas.equals(aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cpf, disciplinas);
    }
}
