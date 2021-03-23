package Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {

        //exibir data atual
        LocalDate data = LocalDate.now(); // cria a data
        System.out.println(data);

        //exibe data e hora
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        //exibe data e hora formatados
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String printDate = dataHora.format(dataFormat);
        System.out.println(printDate);


    }
}
