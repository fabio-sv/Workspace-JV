package ListaGenerica;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private String cpf;

    // aqui foi criado uma lista do tipo Disciplina que vai receber as disciplinas do aluno
    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    // cálcula a média das notas contidas na lista de disciplinas
    public double getMedia(){

        double media = 0;
        // percorre somando as notas do array disciplina
        for (Disciplina disciplina : disciplinas){
            media += disciplina.getNota();
        }
        // retorna a média
        return media / disciplinas.size(); // size pega o tamanho da lista
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
                ", cpf='" + cpf + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
