package Lambdas.Loop;

import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        vetor.add(10);
        vetor.add(20);
        vetor.add(30);

        //Expressão Lambda
        vetor.forEach((i) -> System.out.println(i));
      
    }
}
