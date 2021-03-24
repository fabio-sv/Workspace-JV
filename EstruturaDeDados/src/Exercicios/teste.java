package Exercicios;

import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {

        armstrong(153);

    }
    static boolean armstrong(int valor){

        ArrayList<Integer> list = new ArrayList<>();
        String txt = Integer.toString(valor);

        for(int i = 0; i < txt.length(); i++){
            StringBuilder builder = new StringBuilder();
            builder.append(txt.charAt(i));
            int temp = Integer.parseInt(builder.toString());

            list.add(temp * temp * temp);

        }
        int soma = 0;
        for(Integer i : list){
            soma = soma + i;
        }
        if(soma == valor){
            return true;
        }
        else {
            return false;
        }
    }
}
