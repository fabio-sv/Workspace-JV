package Datas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClasse {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        System.out.println(hoje);

        //Data de hoje
        int ano = hoje.get(Calendar.YEAR);
        System.out.println("Ano: " + ano);

        //Mês atual
        int mes = hoje.get(Calendar.MONTH);
        System.out.println("Mês: " + (mes + 1)); //Jan americano é 0

        //Dia atual
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        System.out.println("Dia: " + dia);

        //Horas - Minutos - Segundos
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minitos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1),
                ano, hora, minitos, segundos);

        hoje.add(Calendar.DAY_OF_MONTH, 5); // para subtrair dias use números negativos
        System.out.println("Data atual mais 5 dias: " + hoje.get(Calendar.DAY_OF_MONTH));


    }
}
