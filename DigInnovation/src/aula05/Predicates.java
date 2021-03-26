package aula05;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {

        //Verifica se a String está vazia ou contém texto
        Predicate<String> estaVazio = s -> s.isEmpty();
        System.out.println(estaVazio.test("Jane")); //false
        System.out.println(estaVazio.test("")); //true
    }
}
