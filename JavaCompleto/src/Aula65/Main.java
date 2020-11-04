package Aula65;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product();
		
		System.out.println("Nome do produto: ");
		p1.name = sc.next();
		System.out.println("Valor R$ ");
		p1.price = sc.nextDouble();
		System.out.println("Quantidade: ");
		p1.AddProduct(sc.nextInt());
		
		System.out.println("Dados do Produto: Nome " + p1.name + ", Preço R$ " + p1.price + ", Unidades " + p1.quantity +
		", Total R$" + p1.TotalStock());
		
		System.out.println();
		System.out.println("Adicionar Produto: ");
		p1.AddProduct(sc.nextInt());
		System.out.println("Dados do produto: Nome " + p1.name + ", Preço R$ " + p1.price + ", Unidades " + p1.quantity +
				", Total R$" + p1.TotalStock());
		
		System.out.println();
		System.out.println("Remover Produto: ");
		p1.RemovePrduct(sc.nextInt());
		System.out.println("Dados do Produto: Nome " + p1.name + ", Preço R$ " + p1.price + ", Unidades " + p1.quantity +
				", Total R$" + p1.TotalStock());
		
		System.out.println();
		
		//toString aula 66
		System.out.println(p1);
			
		sc.close();
	
	}

}
