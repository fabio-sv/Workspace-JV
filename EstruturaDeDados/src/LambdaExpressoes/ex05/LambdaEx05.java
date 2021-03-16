package LambdaExpressoes.ex05;

interface ConcatenaString{ //Exemplo expressão lambda várias afirmações

    String run(String mensagem);
}

public class LambdaEx05 {


    public static void main(String[] args) {

        ConcatenaString concat = (mensagem) -> {

            String nome = "Jane";
            String nomeCompleto = nome + mensagem;

            return nomeCompleto;
        };

        System.out.println(concat.run(" Green"));

        //Saída:: Jane Green
    }
}
