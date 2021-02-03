package EstruturaDados.Exception;

public class NumberFormat {
    public static void main(String[] args) {

        /* NumberFormatException ocorre quando uma variável recebe um valor de tipo diferente
        *
        * var int = double
        * var int = boolean
        * var int = char*/

     int numero = Integer.parseInt(null);

     /* Saida

    Exception in thread "main" java.lang.NumberFormatException: null
	at java.lang.Integer.parseInt(Integer.java:542)
	at java.lang.Integer.parseInt(Integer.java:615)
	at EstruturaDados.Exception.NumberFormat.main(NumberFormat.java:12)*/

    }
}
