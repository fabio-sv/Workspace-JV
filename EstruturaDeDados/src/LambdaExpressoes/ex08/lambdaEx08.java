package LambdaExpressoes.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

public class lambdaEx08 {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto(1, "Samsung A5", 17000f));
        lista.add(new Produto(3, "Iphone 6S", 65000f));
        lista.add(new Produto(2, "Sony Xperia", 25000f));
        lista.add(new Produto(4, "Nokia Lumia", 15000f));
        lista.add(new Produto(5, "Redmi4", 26000f));
        lista.add(new Produto(6,"lenovo Vibe", 19000));

        //Expressão lambda - filtar dados
        Stream<Produto> filtrarDados = lista.stream().filter(qq_Nome -> qq_Nome.preco > 20000);

        filtrarDados.forEach(
                produto -> System.out.println(produto.nome + ": " + produto.preco)
        );

        /*Saída::

          Iphone 6S: 65000.0
          Sony Xperia: 25000.0
          Redmi4: 26000.0*/
    }
}
