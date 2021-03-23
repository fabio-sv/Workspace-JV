package Lambdas.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Produto{
    int id;
    String nome;
    float preco;

    public Produto(int id, String nome, float preco){
        super();
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
public class LambdaEx07 {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto(1,"HP notebook", 25000f));
        lista.add(new Produto(3,"keybord", 300f));
        lista.add(new Produto(2,"Dell mouse", 150f));

        System.out.println("Ordenando com base no nome...");

        Collections.sort(lista,(valor1, valor2) ->{ // Expressão lambda de comparação
           return valor1.nome.compareTo(valor2.nome);
        });

        for(Produto prod : lista){
            System.out.println(prod.id + " " + prod.nome + " " + prod.preco);
        }

    }
}
