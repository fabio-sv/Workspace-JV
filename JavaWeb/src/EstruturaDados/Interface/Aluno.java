package EstruturaDados.Interface;

public class Aluno extends Pessoa implements PermitirAcesso{

    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override // interface sobreescrita
    public boolean acesso() {
        return login.equals("admim") && senha.equals("admim");
    }
}
