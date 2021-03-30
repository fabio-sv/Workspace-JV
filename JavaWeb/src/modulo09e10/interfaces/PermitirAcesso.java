package modulo09e10.interfaces;

// será o contrato de autenticação
public interface PermitirAcesso {

    // apenas declaração de método
    public boolean autenticar(String login, String Senha);

    public boolean autenticar();

}
