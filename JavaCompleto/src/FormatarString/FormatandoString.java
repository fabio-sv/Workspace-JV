package FormatarString;

public class FormatandoString {

	public static void main(String[] args) {
		
		String original = "asdf ASDFG asdf ASDFG";
		String teste = original;
		int i = teste.indexOf("f");
		
		System.out.println("String original: " + original);
		System.out.println("M�todo toLowerCase: " + teste.toLowerCase()); //tudo minusculo
		System.out.println("M�todo toUpperCase " + teste.toUpperCase()); // tudo maiusculo
		System.out.println("M�todo Trim " + teste.trim()); //elimina os espa�os vazio
		System.out.println("M�todo substring " + teste.substring(2)); // elimina os dois primeiros caracteres
		System.out.println("M�todo substirng " + teste.substring(2, 9));
		System.out.println("M�todo replace " + teste.replace('a', 'x')); //troca "a" por "x"
		System.out.println("M�todo indexof " + i);
		

	}

}
