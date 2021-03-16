package LambdaExpressoes.ex03;

interface FuncaoPrintNome { //Exemplo de expressão lambda com 1 parâmetro

    String run(String nome);
}

public class LambdaEx03 {
    public static void main(String[] args) {

        FuncaoPrintNome printNome = (nome) -> {

            return "Ola, " + nome;
        };

        System.out.println(printNome.run("Jane"));

        //Saída:: Ola, Jane
    }
}
