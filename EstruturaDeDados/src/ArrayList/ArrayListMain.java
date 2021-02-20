package ArrayList;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>();

        //adiciona alementos
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");

        System.out.println(carros);

        //acessando im indice
        carros.get(0);
        System.out.println(carros.get(0));

        //alterar um elemento
        carros.set(0, "Opel");
        System.out.println(carros);

        //remove um elemento
        carros.remove(0);
        System.out.println(carros);

        //tamanho da lista
        carros.size();
        System.out.println(carros.size());

        //remove todos os elementos
        carros.clear();
        System.out.println(carros);



    }
}
