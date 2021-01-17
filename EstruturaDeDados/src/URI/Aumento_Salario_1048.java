package URI;

import java.util.Locale;
import java.util.Scanner;

public class Aumento_Salario_1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        if (salario > 0 && salario <= 400.00){
            double reajuste = salario * 0.15;

            System.out.println("Novo salario: " + String.format("%.2f", salario + reajuste));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + "15 %");

        } else if (salario >= 400.01 && salario <= 800.00){
            double reajuste = salario * 0.12;

            System.out.println("Novo salario: " + String.format("%.2f", salario + reajuste));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + "12 %");

        } else if (salario >= 800.01 && salario <= 1200.00){
            double reajuste = salario * 0.10;

            System.out.println("Novo salario: " + String.format("%.2f", salario + reajuste));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + "10 %");

        } else if (salario >= 1200.01 && salario <= 2000.00){
            double reajuste = salario * 0.07;

            System.out.println("Novo salario: " + String.format("%.2f", salario + reajuste));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + "7 %");

        } else if (salario > 2000.00){
            double reajuste = salario * 0.04;

            System.out.println("Novo salario: " + String.format("%.2f", salario + reajuste));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + "4 %");

        }

    }
}
