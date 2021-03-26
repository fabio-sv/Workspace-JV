package aula05;

import java.util.function.Supplier;

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Jane";
        idade = 23;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

public class Suppliers {
    public static void main(String[] args) {

        Supplier<Pessoa> supplier = () -> new Pessoa();
        System.out.println(supplier.get());

        //Saída:: Pessoa{nome='Jane', idade=23}

    }
}
