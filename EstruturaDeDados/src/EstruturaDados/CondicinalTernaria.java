package Secao5;

public class CondicinalTernaria {
    public static void main(String[] args) {

        System.out.println(2 > 4 ? 50 : 80); // saida 80
        System.out.println((10 != 3) ? "Maria" : "Alex"); // saida Maria

        double preco = 40.5;
        double desconto;


        //Usando if else
        if (preco < 20.0){
            desconto = preco * 0.1;

        }else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);


        //Usando  operação ternaria 
        double opTernario = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
                                             //se menor    //se maior
        System.out.println(opTernario);
    }
}
