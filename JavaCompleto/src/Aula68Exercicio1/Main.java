package Aula68Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		rectangle retangulo = new rectangle();
				
		System.out.println("Informe a altura do retangulo em centimetros: ");
		retangulo.altura = scan.nextDouble();
		System.out.println("Informe a largura do retangulo em centimetros: ");
		retangulo.largura = scan.nextDouble();
		
		System.out.println("Area: " + retangulo.Area() + " cm²");
		System.out.println("Perimetro: " + retangulo.Perimetro());
		System.out.println("Diagonal: " + retangulo.Diagonal());
		
		scan.close();	

	}

}
