package Secao4;

import java.util.Locale;

public class PrintFormatado {
    public static void main(String[] args) {

        //Formato padrão americano...
        Locale.setDefault(Locale.US);

        double valor = 10.0000;

        System.out.printf("Valor %.2f", valor);
    }
}
