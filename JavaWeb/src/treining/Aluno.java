package treining;


public class Aluno extends Pessoa implements Validar{

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

    private String ra;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public boolean validacao() {
        return login.equals("adg") && senha.equals("adg") && getNome().equals("jane");
    }
}
