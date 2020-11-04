package OperacoesMatematicas;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		
		double x = 9.0;
		double y = 2.0;
		double z = - 1.0;
		double a, b, c;
		
		// Raiz Quadrada
		a = Math.sqrt(x);
		// Potência y²
		b = Math.pow(y, y);
		// Valor Absoluto 
		c = Math.abs(z);
		
		System.out.printf("A raiz quadrada de " + x + " de " + "%.1f", a);
		System.out.println();
		System.out.println(y + " elevado a potência " + y + " é " + b);
		System.out.println("O valor  absoluto de " + z + " é " + c);
		
		// Lista completa de operações em: java.lang.Math
	}

}
