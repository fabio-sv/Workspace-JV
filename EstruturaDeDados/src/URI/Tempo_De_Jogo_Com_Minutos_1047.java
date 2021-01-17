package URI;

import java.util.Scanner;

public class Tempo_De_Jogo_Com_Minutos_1047 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        if (horaInicial <= horaFinal){

            int segundosTotais = ((horaFinal * 60) + minutoFinal) - ((horaInicial * 60) + minutoInicial);
            int totalHoras = segundosTotais / 60;
            int totalMinutos = segundosTotais % 60;

            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");

        } else if(horaInicial > horaFinal){

            int segundosTotais = (1440 - ((horaInicial * 60) + minutoInicial)) + ((horaFinal * 60) + minutoFinal);
            int totalHoras = segundosTotais / 60;
            int totalMinutos = segundosTotais % 60;

            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");

        }


    }

}
