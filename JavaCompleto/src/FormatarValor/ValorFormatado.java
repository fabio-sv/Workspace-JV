package FormatarValor;

import java.util.Locale;

public class ValorFormatado {

	public static void main(String[] args) {
		
		double valor = 54.23471111;
		
		// Padr�o de formata��o Portugu�s
		System.out.printf("%.2f%n", valor);
		
		// Padr�o de formata��o Americano
		Locale.setDefault(Locale.ENGLISH);
		
		System.out.printf("%.2f%n", valor);	
	}

}
