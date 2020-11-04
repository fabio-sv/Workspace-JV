package ExercioContaBancaria;

public class Conta {

    private String nome;
    private int numeroConta;
    private double saldo = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    //Método que adiciona novas contas...
    public void addConta(int conta) {

        if (this.numeroConta != conta) {
            this.numeroConta = conta;

        } else {
            System.out.println("Esta conta já esta vinculada");

        }
    }

    //Metodo para depósito na conta...
    public void depositar(double deposito){
        if (deposito > 0){
            this.saldo = this.saldo + deposito;
        }
        else{
            System.out.println("Valor de depósito invalido");
        }
    }
    public void saque(double saque){
        if(this.saldo >= saque){
            this.saldo = this.saldo - (saque - (saque * 0.05));
        }
        else {
            System.out.println("Valor de saque invalido");
        }
    }

    //Metodo que informa o saldo da conta...
    public double saldo(){
        return this.saldo;
    }
}
