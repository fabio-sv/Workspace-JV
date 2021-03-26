package aula04; //Taill Call

public class RecursividadeEx02 {
    public static void main(String[] args) {

        System.out.println(fatorial(5));

        //Saída:: 120.0
    }

    public static double fatorial(double valor){
        return fatorialComTailCall(valor, 1);
    }

    public  static double fatorialComTailCall(double valor, double numero){
        if(valor == 0){
            return  numero;
        }
        return fatorialComTailCall(valor - 1, numero * valor);
    }
}
