package HashMaps;

import java.util.HashMap;

public class Hash02 {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<String, Integer>();

        pessoas.put("Jane", 32); //Nome e idade
        pessoas.put("Jhow", 18);
        pessoas.put("Mayke", 23);

        //imprime no console os dados da HashMap
        for(String i : pessoas.keySet()){
            System.out.println("Nome: " + i + ", Idade: " + pessoas.get(i));
        }
    }
}
