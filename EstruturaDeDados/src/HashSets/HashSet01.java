package HashSets;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("BMW");

        System.out.println(cars);

        /*BMW foi adicionado duas vezes, porém aparece apenas uma vez
        * no conjunto porque cada item em um conjunto deve ser único */

        System.out.println("-------------------");

        //Verificar se um item existe na lista
        System.out.println(cars.contains("Mazda")); //true

        System.out.println("-------------------");

        //Remove um item
        cars.remove("Mazda");
        System.out.println(cars);

        System.out.println("-------------------");

        //tamanho
        System.out.println(cars.size());

        System.out.println("-------------------");

        for(String i : cars){
            System.out.println(i);
        }

        //remove todos os itens da lista
        cars.clear();
        System.out.println(cars);
    }
}
