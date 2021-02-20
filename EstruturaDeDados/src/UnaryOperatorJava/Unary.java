package UnaryOperatorJava;

import java.util.function.UnaryOperator;

public class Unary {
    public static void main(String[] args) {

        //calcular é a lambda
        UnaryOperator<Integer> calcula = valor -> valor * 3; //paradigma funcional

        // criando a variável valor
        int valor;

        System.out.println(calcula.apply(10));
    }
}
