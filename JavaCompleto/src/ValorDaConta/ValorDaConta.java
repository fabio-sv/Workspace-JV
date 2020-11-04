package ValorDaConta;

import java.util.Scanner;

public class ValorDaConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double minutos, valor;
		
		System.out.println("Quantidade de minutos: ");
		minutos = sc.nextDouble();
		
		if(minutos <= 100) {
			valor = 50.00;
			System.out.println("Valor a pagar R$ " + valor);
		}
		else {
			valor = (minutos - 100) * 2.00 + 50.00;
			System.out.println("Valor a pagar R$ " + valor);
		}
		
		sc.close();
	}

}
