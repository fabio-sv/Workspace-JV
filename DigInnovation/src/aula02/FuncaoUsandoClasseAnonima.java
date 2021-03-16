package aula02;

public class FuncaoUsandoClasseAnonima {
    public static void main(String[] args) {
      Funcao colocarPrefixo = valor -> "Sr. " + valor;

        System.out.println(colocarPrefixo.gerar("Jhon"));

    }
}
