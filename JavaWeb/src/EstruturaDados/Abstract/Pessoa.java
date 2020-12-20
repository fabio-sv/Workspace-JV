package EstruturaDados.Abstract;

// abstract impede que a classe Pessoa seja instânciada
public abstract class Pessoa {

    protected String nome;
    protected int idade;

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

    // método abstrato da classe pai é obrigatória para as classes filhas
    public abstract double salario ();
}
