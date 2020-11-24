package EqualsHascode.exe02;

public class Professor {

    private String nome;
    private String disciplina1;
    private String disciplina2;
    private String disciplina3;
    private String disciplina4;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina1='" + disciplina1 + '\'' +
                ", disciplina2='" + disciplina2 + '\'' +
                ", disciplina3='" + disciplina3 + '\'' +
                ", disciplina4='" + disciplina4 + '\'' +
                '}';
    }
}
