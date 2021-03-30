package modulo09e10.classAux;

import modulo09e10.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean auteniticar(){
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;

    }

}
