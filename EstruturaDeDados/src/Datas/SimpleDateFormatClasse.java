package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormatClasse {
    public static void main(String[] args) {

        //Entrada de data formatada
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        Calendar data = new GregorianCalendar(2010,2, 20, 14, 32, 25);
        System.out.println("Data: " + simpleDateFormat.format(data.getTime()));

        //Outra maneira
        Date hoje = new Date();
        System.out.println("Data2: " + simpleDateFormat.format(hoje));

        //Passsando string para data
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData  = "20/05/2021";

        try {
            Date minhaDataEmDate = simpleDateFormat1.parse(minhaData);
            System.out.println(simpleDateFormat1.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Passando de data para string
        String d = simpleDateFormat.format(hoje);
        System.out.println(d);
    }
}
