package LambdaExpressoes;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        vetor.add(10);
        vetor.add(20);
        vetor.add(30);

        //Consumer permite que uma variável receba uma expressão lambda
        Consumer<Integer> listarArray = (i) -> System.out.println(i);
        vetor.forEach(listarArray);
    }
}
