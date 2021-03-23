package Exercicios;


public class Palindromos {
    public static void main(String[] args) {

        palindromo("reviver");

    }

    public static void palindromo(String txt) {

        char[] vetorInverte = new char[txt.length()];
        int aux = 0;

        //inverte o texto
        for (int i = vetorInverte.length - 1; i >= 0; i--) {
            vetorInverte[aux] = txt.charAt(i);
            aux++;
        }
        //converte Array em String
        StringBuilder builder = new StringBuilder();
        for (char i : vetorInverte) {
            builder.append(i);
        }
        String str = builder.toString();

        //Compara as Strings
        if (txt.equals(str)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não Palindromo");
        }

    }
}
