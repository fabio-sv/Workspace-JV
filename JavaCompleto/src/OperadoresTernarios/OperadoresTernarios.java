package OperadoresTernarios;

import java.util.Scanner;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Informe o valor do produto: ");
		valor = sc.nextDouble();
		
		valor = (valor > 100.0) ? valor - (valor * 0.20) : valor - (valor * 0.10);
		
		System.out.printf("Valor do produto com desconto: R$ " + "%.2f",  valor);
		
		sc.close();

	}

}
