package Aula68Exercicio1;

public class rectangle {
	
	protected double altura; //height
	protected double largura;//width
	
	public double Area() {
		return altura * largura;
	}
	public double Perimetro() {
		return (altura + largura) * 2;
	}
	public double Diagonal() {
		//raiz quadrada "sqrt"
		return Math.sqrt((largura * 2 + altura * 2));
	}
	

}
