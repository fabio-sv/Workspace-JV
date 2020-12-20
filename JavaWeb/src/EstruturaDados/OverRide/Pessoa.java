package EstruturaDados.OverRide;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    protected String nome;
    protected int idade;

    List<Pessoa> alunos = new ArrayList<Pessoa>();

    public void setAlunos(List<Pessoa> alunos) {
        this.alunos = alunos;
    }

    public List<Pessoa> getAlunos() {

        return alunos;
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

    public boolean maiorIdade(){
        return idade >= 18;
    }




}
