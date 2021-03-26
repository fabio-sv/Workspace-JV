package aula04;

public class RecursividadeEx01 {
    public static void main(String[] args) {

        System.out.println(fatorial(5));

        //Saída:: 120

    }

    public static int fatorial(int valor){
        if(valor == 1){
            return valor;

        }else
            return valor * fatorial((valor - 1));

    }
}
