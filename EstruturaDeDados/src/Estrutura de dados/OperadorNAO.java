package Secao4;

public class OperadorNAO {
    public static void main(String[] args) {

        int x = 5;

        /*
        TABELA VERDADE NAO
        A ===== !A
        F        V
        V        F
         */

        System.out.println(!(x == 10)); //true
        System.out.println(!(x >= 2)); //false
        System.out.println(!(x <= 20 && x == 10)); //true
    }
}
