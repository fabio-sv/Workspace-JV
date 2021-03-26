package aula05;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {

        Calculo soma = (a, b) -> a + b;
        System.out.println(executarOperacao(soma, 10, 20));

        //Saída:: 30

    }

    //Função de alta ordem
    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);

    }
}

interface Calculo {
    public int calcular(int a, int b);
}