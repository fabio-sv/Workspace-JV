package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Aula01 {
    public static void main(String[] args) {

        //paradigma funcional
        UnaryOperator<Integer> calcula = valor -> valor * 10;

        //declaração da variável
        int valor;

        System.out.println(calcula.apply(5));
    }
}
