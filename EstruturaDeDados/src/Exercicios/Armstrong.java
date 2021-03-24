package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println(armstrong(153));

    }
    public static boolean armstrong(int valor){

        //transforma em String
        String temp = Integer.toString(valor);
        int index = temp.length();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < index; i++){
            StringBuilder builder = new StringBuilder();
            builder.append(temp.charAt(i));
            String str = builder.toString();

            int numero = Integer.parseInt(str);
            numero = numero * numero * numero;
            list.add(numero);

        }

        int soma = 0;
        for (Integer i : list){
            soma += i;

        }
        if(soma == valor){
            return true;
        }
        else {
            return false;
        }

        //153 = (1*1*1)+(5*5*5)+(3*3*3)

    }

}
