package FormatarValor;

import java.util.Locale;

public class ValorFormatado {

	public static void main(String[] args) {
		
		double valor = 54.23471111;
		
		// Padrão de formatação Português
		System.out.printf("%.2f%n", valor);
		
		// Padrão de formatação Americano
		Locale.setDefault(Locale.ENGLISH);
		
		System.out.printf("%.2f%n", valor);	
	}

}
