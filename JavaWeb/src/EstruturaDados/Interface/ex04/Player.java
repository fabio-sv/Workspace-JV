package EstruturaDados.Interface.ex04;

public class Player implements Validador {

    private String login;
    private String senha;

    public Player(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean validadorPlayer(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return validadorPlayer();
    }

    @Override
    public boolean validadorPlayer() {
        return login.equals("adm") && senha.equals("adm") ;
    }
}
