package HashSets;

import java.util.HashSet;

public class HashSet02 {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(10);
        numeros.add(5);
        numeros.add(2);

        //loop do HashSet
        for(int i = 0; i <= 10; i++){
            if(numeros.contains(i)){
                System.out.println(i + " faz parte do hashSet");
            }
            else {
                System.out.println(i + " não faz parte do hashSet");
            }
        }
    }
}
