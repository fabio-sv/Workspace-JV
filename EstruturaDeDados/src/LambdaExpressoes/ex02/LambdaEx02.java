package LambdaExpressoes.ex02;

interface FuncaoPrint { //Exemplo de expressão lambda sem parâmetro

    String run();
}

public class LambdaEx02 {
    public static void main(String[] args) {

        FuncaoPrint print = () -> {
            return "Olá, Mundo";
        };

        System.out.println(print.run());
    }
}
