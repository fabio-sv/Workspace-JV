package programa.classAux;

import programa.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean auteniticar(){
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;

    }

}
