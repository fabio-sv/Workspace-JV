package EstruturaDados.Interface.ex02;

public class Secretario extends Pessoa implements PermitirAcesso{

    @Override
    public boolean autenticar(String login, String senha) {
        return login.equals("admim") && senha.equals("admim"); // retorna true ou false
    }
}
