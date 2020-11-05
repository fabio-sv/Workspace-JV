package herancaPoliformismo;

public class Animal {
    private String tipo;
    private String nome;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void som(){
        System.out.println("Au AU...");
    }
}
