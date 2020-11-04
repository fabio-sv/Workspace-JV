package FormatarString;

public class FormatandoString {

	public static void main(String[] args) {
		
		String original = "asdf ASDFG asdf ASDFG";
		String teste = original;
		int i = teste.indexOf("f");
		
		System.out.println("String original: " + original);
		System.out.println("Método toLowerCase: " + teste.toLowerCase()); //tudo minusculo
		System.out.println("Método toUpperCase " + teste.toUpperCase()); // tudo maiusculo
		System.out.println("Método Trim " + teste.trim()); //elimina os espaços vazio
		System.out.println("Método substring " + teste.substring(2)); // elimina os dois primeiros caracteres
		System.out.println("Mètodo substirng " + teste.substring(2, 9));
		System.out.println("Método replace " + teste.replace('a', 'x')); //troca "a" por "x"
		System.out.println("Método indexof " + i);
		

	}

}
