package br.com.caelum.ed;

public class Aluno {

    String nome;

    public String nome() {
        return nome;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }

    //Compara dois objetos do tipo  aluno
    public boolean equals(Object o) {
        Aluno outro = (Aluno) o;
        return this.nome.equals(outro.nome);
    }
}
