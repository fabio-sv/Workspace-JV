package aula06;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {

        String[] nomes = {"Jane", "Jone", "Jhon","Make"};

        imprimeNome(nomes);

    }
    public static void imprimeNome(String... nomes){

        String funcaoImprime = Stream.of(nomes)
                .filter(nome -> nome.equals("Jane"))
                .collect(Collectors.joining());

        System.out.println("Nome: " + funcaoImprime);

        Stream.of(nomes)
                .forEach(nome -> System.out.println(nome));
    }

}
