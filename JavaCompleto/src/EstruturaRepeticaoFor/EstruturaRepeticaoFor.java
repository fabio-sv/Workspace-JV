package EstruturaRepeticaoFor;

import java.util.Scanner;

public class EstruturaRepeticaoFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int soma = 0;
		
		System.out.println("Informe a quantidade de somas: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;	
		}
		System.out.println("Soma: "+ soma);
		
		sc.close();
		
	}

}
