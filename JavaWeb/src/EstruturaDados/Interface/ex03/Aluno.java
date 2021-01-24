package EstruturaDados.Interface.ex03;

public class Aluno implements Validar{

    private String nome;
    private String idade;
    private String login;
    private String senha;

    // método construtor vazio
    public Aluno(){

    }
    // médoto construtor que recebe  login e senha por argumento
    public Aluno(String login, String senha){
        this.login = login;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    // interface verifica login e senha
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;

        return autenticar();
    }

    @Override
    // interface faz a validação de login e senha
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }
}
