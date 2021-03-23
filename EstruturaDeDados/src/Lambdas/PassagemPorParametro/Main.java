package Lambdas.PassagemPorParametro;

public class Main {
    public static void main(String[] args) {

        //Expressão lambda
        StringFunction nome = (s) -> s + "Jane";
        StringFunction nome2 = (s) -> s + "Jhon";

        printFormatted("Ola ", nome);
        printFormatted("Ola ", nome2);

    }
    public static void printFormatted(String str, StringFunction format){

        String result = format.run(str);
        System.out.println(result);

    }
}
