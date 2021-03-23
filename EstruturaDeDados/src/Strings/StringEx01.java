package Strings;

public class StringEx01 {
    public static void main(String[] args) {

        String txt = "Java";

        //Imprime o indice referênciado por charAt
        System.out.print(txt.charAt(0) + ", ");
        System.out.print(txt.charAt(1) + ", ");
        System.out.print(txt.charAt(2) + ", ");
        System.out.print(txt.charAt(3) + ", \n");


        System.out.println("-------------------");

        // Imprime o caractere unicode de cada índice
        System.out.print(txt.codePointAt(0) + ", ");
        System.out.print(txt.codePointAt(1) + ", ");
        System.out.print(txt.codePointAt(2) + ", ");
        System.out.print(txt.codePointAt(3) + ", \n");

        System.out.println("-------------------");

        // Retorna o Unicode na faixa de texto especificada desta sequência
        System.out.print(txt.codePointBefore(1) + ", ");
        System.out.print(txt.codePointBefore(2) + ", ");
        System.out.print(txt.codePointBefore(3) + ", ");
        System.out.print(txt.codePointBefore(4) + ", \n");

        System.out.println("-------------------");

        System.out.print(txt.codePointCount(0, 4) + "\n");



    }
}
