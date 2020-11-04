package Aula68Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Aluno alu = new Aluno();
		
		System.out.println("Nome do aluno: ");
		alu.nome = ler.next();
		
		System.out.println("Nota 1: ");
		alu.nota[0] = ler.nextDouble();
		
		System.out.println("Nota 2: ");
		alu.nota[1] = ler.nextDouble();
		
		System.out.println("Nota 3: ");
		alu.nota[2] = ler.nextDouble();
		
		alu.Status();
		
		ler.close();

	}

}
