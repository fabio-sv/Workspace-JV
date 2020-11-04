package CalculoDeAreaTerreno;

import java.util.Scanner;

public class CalculoDeAreaTerreno {

	public static void main(String[] args) {
		
		double altura, largura, area, preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.println("Informe a profundidade do terreno: ");
		altura = sc.nextDouble();
		System.out.println("Informe o valor do metro quadado: ");
		preco = sc.nextDouble();
		
		area = largura * altura;
		preco *= area;

		System.out.printf("A area do terreno é: " + area + " m², e o preço é de " + "%.2f%n", preco);
		
		sc.close();

	}

}
