package FormatarString;

public class OperacaoSplit {

	public static void main(String[] args) {
		
		String x = "potato apple lemon";
		
		String[] vect = x.split(" ");
		
		String a = vect[0];
		String b = vect[1];
		String c = vect[2];
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}

}
