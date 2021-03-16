package aula01;

import java.util.function.BiPredicate;

//funções puras
public class Aula02B {
    public static void main(String[] args) {

        //verifica se valor01 é maior que valor02
        BiPredicate<Integer, Integer> verificaSeMaior = (valor01, valor02) -> valor01 > valor02;

        System.out.println(verificaSeMaior.test(10, 20));
        System.out.println(verificaSeMaior.test(20, 10));

        //outside: false
        //outside: true



    }
}
