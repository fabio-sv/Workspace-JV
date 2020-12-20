package EstruturaDados.Abstract;

public class Aluno extends Pessoa {

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override // aqui o método salário é sobreescrito
    public double salario() {
        return 1500.00;
    }
}
