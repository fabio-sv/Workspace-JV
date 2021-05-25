package URI;

import java.util.Scanner;

public class uri1047 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        calculaTempo(horaInicial, minutoInicial, horaFinal, minutoFinal);
    }

    public static void calculaTempo(int horaInicio, int minutoInicial, int horaFim, int minutoFim) {
        int hora = 0;
        int minuto = 0;

        if (horaInicio == horaFim && minutoInicial == minutoFim) {
            hora = 24;
        }

        //mesmo dia
        if (horaInicio < horaFim) {
            if (horaInicio == 0) {
                horaInicio = 24;
            }
            if (horaFim == 0) {
                horaFim = 24;
            }
            int totalMinutos = ((horaFim * 60) + minutoFim) - ((horaInicio * 60) + minutoInicial); //converte min
            hora = totalMinutos / 60;
            minuto = totalMinutos % 60;
        }

        //outro dia
        if (horaInicio > horaFim) {
            if (horaInicio == 0) {
                horaInicio = 24;
            }
            if (horaFim == 0) {
                horaFim = 24;
            }
            int primeiroDia = 1440 - ((horaInicio * 60) + minutoInicial);
            int primeiroSegundoDia = 1440 - ((horaFim * 60) + minutoFim);
            hora = (primeiroDia + primeiroSegundoDia) / 60;
            minuto = (primeiroDia + primeiroSegundoDia) % 60;
        }

        if(hora > 24){
            hora = 24;
            minuto = 0;
        }

        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
    }
}
