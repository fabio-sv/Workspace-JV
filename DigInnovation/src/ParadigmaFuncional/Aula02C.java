package ParadigmaFuncional;

import java.util.function.UnaryOperator;

//Imutabilidade
public class Aula02C {
    public static void main(String[] args) {
        int valor = 20;

        UnaryOperator<Integer> retornaDobro = v -> v * 2;

        System.out.println(retornaDobro.apply(valor));
        System.out.println(valor);


    }
}
