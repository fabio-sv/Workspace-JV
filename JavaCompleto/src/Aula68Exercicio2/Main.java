package Aula68Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.println("Nome: ");
		func.nome = ler.nextLine();
		System.out.println("Salario bruto: R$");
		func.salario = ler.nextDouble();
		System.out.println("Imposto: % ");
		func.imposto = ler.nextDouble();
		System.out.println("Salario liquido: R$ " + func.SalarioLiquido());
		
		System.out.println("Dicidio: % ");
		double x = 0;
		x = ler.nextDouble();
		func.Dicidio(x);
		
		ler.close();

	}

}
