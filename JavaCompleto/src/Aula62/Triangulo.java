package Aula62;

public class Triangulo {
	
	double a, b, c;
	
	public Triangulo() {
		
	}
	
	public void Area() {
		this.a = a;
		this.b = b;
		this.c = c;
		
		double p = a + b + c / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Area " + area);
		
	}
	

}
