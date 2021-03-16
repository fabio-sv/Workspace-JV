package LambdaExpressoes.ex04;

interface Calcula { // Exemplo de expressão lambda com multiplos parâmetros

    int run(int a, int b);
}

public class LambdaEx04 {
    public static void main(String[] args) {

        Calcula soma = (a, b) -> (a + b);
        System.out.println(soma.run(10, 10));

        Calcula multiplica = (a, b) -> (a * b);
        System.out.println(multiplica.run(10, 10));

        Calcula subtracao = (int a, int b) -> {
            return (a - b);
        };
        System.out.println(subtracao.run(10, 5));

        /*Saída:: 20
                  100
                  5*/
    }
}
