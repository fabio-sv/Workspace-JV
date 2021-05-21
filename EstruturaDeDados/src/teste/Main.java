package teste;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

      Date hoje = new Date();

        System.out.println(hoje);
        System.out.println("Milisegundos desde 1 jan 1970: " + hoje.getTime());
        System.out.println("Dia do mês: " + hoje.getDate());



    }
}
