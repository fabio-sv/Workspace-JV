package Strings;

public class StringEx02 {
    public static void main(String[] args) {

        String txt = "Java";

        // Imprime o caractere unicode de cada índice
        System.out.println(txt.codePointAt(0));
        System.out.println(txt.codePointAt(1));
        System.out.println(txt.codePointAt(2));
        System.out.println(txt.codePointAt(3));
    }
}
