package aula07;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] numeros = {2,4,5,7,3,2,5};

        imprimeDobroDeCadaValor(numeros);

    }
    public static void imprimeDobroDeCadaValor(Integer... numeros){
        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
