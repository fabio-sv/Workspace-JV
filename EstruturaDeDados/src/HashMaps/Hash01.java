package HashMaps;

import java.util.HashMap;

public class Hash01 {
    public static void main(String[] args) {

        HashMap<String, String> cars = new HashMap<String, String>();

        //add chave e valor
        cars.put("BMW", "320i"); //BMW é a chave e 320i é o valor
        cars.put("Audi", "RS7");
        cars.put("Ferrari", "Spider");

        System.out.println(cars);  //{Ferrari=Spider, Audi=RS7, BMW=320i}

        System.out.println("---------------------------");

        //Acessando um valor no HashMap
        System.out.println(cars.get("Audi")); //RS7

        System.out.println("---------------------------");

        //remove um elemento
        cars.remove("Audi");
        System.out.println(cars); //{Ferrari=Spider, BMW=320i}

        System.out.println("---------------------------");

        //tamanho do HashMap
        System.out.println(cars.size()); //2

        System.out.println("---------------------------");

        //KeySet acessa a chave
        for(String i : cars.keySet()){
            System.out.println(i);
        }

        System.out.println("---------------------------");

        //Values acessa os valores do HashMap
        for (String i : cars.values()){
            System.out.println(i);
        }

        System.out.println("---------------------------");

        //lista key e value
        for(String i : cars.keySet()){
            System.out.println("Key: " + i + "Value: " + cars.get(i));
        }

        //remove todos os elementos
        cars.clear();
        System.out.println(cars);

    }
}
