package IteratorMetodo;

/*Um Iterator é um objeto que pode ser usado para percorrer coleções, como ArrayList e HashSe*/

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Volvo");

        Iterator<String> list = cars.iterator();

        //imprime o primeiro indice
        System.out.println(list.next());

        System.out.println("-----------------");

        //looping por meio de uma coleção
        while (list.hasNext()){
            System.out.println(list.next());
        }


    }
}
