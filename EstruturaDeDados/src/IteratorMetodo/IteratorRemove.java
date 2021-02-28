package IteratorMetodo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(78);
        numbers.add(59);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(i > 10){
                iterator.remove();
            }
        }
        System.out.println(numbers); // 10
     }
}
