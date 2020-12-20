package EstruturaDados.OverRide;

public class Aluno extends Pessoa{

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override // <- identifica um método sobreenscrito
    public boolean maiorIdade() {
        return super.maiorIdade();
    }

    @Override // <- identifica um método sobreenscrito
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
