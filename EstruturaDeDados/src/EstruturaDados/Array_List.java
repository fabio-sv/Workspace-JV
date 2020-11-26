package EstruturaDados;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        // lista de String
        ArrayList<String> arrayList = new ArrayList();

        // adiciona elementos
        arrayList.add("Jane");
        arrayList.add("Jhon");
        arrayList.add("Make");

        System.out.println(arrayList); // saída Jane, Jhon, Make

        // remove a posição 0
        arrayList.remove(0);

        System.out.println(arrayList); // saída Jhon, Make

        // lista de inteiros
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        arrayInt.add(100);
        arrayInt.add(200);
        arrayInt.add(300);

        arrayInt.remove(0);

        System.out.println(arrayInt);

        ArrayList<Double> arrayDouble = new ArrayList<Double>();
        arrayDouble.add(1.0);
        arrayDouble.add(2.0);
        arrayDouble.add(3.0);

        arrayDouble.remove(0);

        System.out.println(arrayDouble);


    }
}
