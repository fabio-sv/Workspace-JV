package modulo09.classes.exAula;

// será o contrato de autenticação
public interface PermitirAcesso {

    // apenas declaração de método
    public boolean autenticar(String login, String Senha);

    public boolean autenticar();

}
