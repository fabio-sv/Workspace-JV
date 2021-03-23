package Strings;

public class StringEx05 {
    public static void main(String[] args) {

        String txt = "Hello";

        //Retorna true se caracter existe na String
        System.out.println(txt.contentEquals("Hello"));
        System.out.println(txt.contentEquals("e"));
        System.out.println(txt.contentEquals("Hi"));
    }
}
