package aula05;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {

        Function<String, String> retornaNomeAoCotrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoCotrario.apply("Jane"));

        //Transforma String em um número inteiro
        Function<String, Integer> transformaEmInteiro = s -> Integer.valueOf(s) * 10;
        System.out.println(transformaEmInteiro.apply("10"));


    }
}
