package Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfPattern {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();

        DateTimeFormatter dataFormatada01 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dataFormatada02 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dataFormatada03 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        DateTimeFormatter dataFormatada04 = DateTimeFormatter.ofPattern("E, MMMM dd yyyy");

        String printData01 = data.format(dataFormatada01);
        String printData02 = data.format(dataFormatada02);
        String printData03 = data.format(dataFormatada03);
        String printData04 = data.format(dataFormatada04);

        System.out.println(printData01);
        System.out.println(printData02);
        System.out.println(printData03);
        System.out.println(printData04);
    }
}
