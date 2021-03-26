package aula05;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {

        Consumer<String> imprime = frase -> System.out.println(frase);
        imprime.accept("Hello World");
    }
}
