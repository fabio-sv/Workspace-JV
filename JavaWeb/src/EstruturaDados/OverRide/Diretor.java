package EstruturaDados.OverRide;

public class Diretor extends Pessoa {

    private String instituicao;

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override // <- identifica um método sobreenscrito
    public boolean maiorIdade() {
        return super.maiorIdade();
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "instituicao='" + instituicao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
