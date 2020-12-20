package EstruturaDados.OverRide;

public class Secretario extends Pessoa{

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override // <- identifica um método sobreenscrito
    public boolean maiorIdade() {
        return super.maiorIdade();
    }

    @Override // <- identifica um método sobreenscrito
    public String toString() {
        return "Secretario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", setor='" + setor + '\'' +
                '}';
    }
}
