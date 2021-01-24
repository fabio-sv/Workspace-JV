package EstruturaDados.Interface.ex04;

class FuncAutentidador {

    private Validador validador;

    public FuncAutentidador (Validador validador){
        this.validador = validador;
    }

    public boolean autenticar(){
        return validador.validadorPlayer();
    }



}
