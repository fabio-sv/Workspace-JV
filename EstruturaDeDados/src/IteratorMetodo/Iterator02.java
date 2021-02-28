package IteratorMetodo;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator02 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Volvo");

        Iterator<String> list = cars.iterator();

        //looping por meio de uma coleção
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}
