package Modulo3.ClassesObjetosMetodosStrings.Accont;

/**
 *
 * @author Fábio
 */
public class Accont {
    
      //variavel do tipo primitivo
    private String name;
    private double balance;
    
    //Método construtor da classe Accont 
    public Accont(String name, double balance){
        this.name = name; 
            //Valida que balance é maior que 0
            if (balance > 0.0){
                this.balance = balance;
            }
        }
    
    //Método que realiza o deposito na variável balance
    public void deposit(double deposit){
        //Valida depósito maior que 0
        if(deposit > 0.0){
            this.balance = deposit;
        }
    }
    
    //Método que informa o valor da variável primitiva balance
    public double getBalance(){
        return this.balance;
    }
    
    //Método que seta o nome
    public void setName(String name){
        this.name = name;    
    }
    
    //Método que informa o valor da variável primitiva name
    public String getName(){
        return this.name;
    }
    
 }
    
