package Modulo3.ClassesObjetosMetodosStrings.Ex17;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        HealthProfile healthProfile = new HealthProfile();

        String nome  = JOptionPane.showInputDialog(null, "Nome");
        healthProfile.setNome(nome);

        String sobrenome = JOptionPane.showInputDialog(null, "Sobrenome");
        healthProfile.setSobrenome(sobrenome);

        do {
            String sexo = JOptionPane.showInputDialog(null, "Sexo");
            healthProfile.setSexo(sexo);
            if (!sexo.equals("Masculino") && !sexo.equals("Feminino")) {
                JOptionPane.showMessageDialog(null, "Erro! Informe Masculino ou Feminino.");

            }
        } while (healthProfile.getValidaSexo() == false);

        System.out.print("Dia de nascimento: ");
        do {
            int dia = input.nextInt();
            healthProfile.setDia(dia);

            if (healthProfile.getDia() > 0 && healthProfile.getDia() < 31) {
                System.out.println("ERRO! Dia do nascimento inválido");
            }

        } while (healthProfile.getDia() < 0 && healthProfile.getDia() > 31);

        System.out.print("Mes de nascimento:");
        int mes = input.nextInt();
        healthProfile.setMes(mes);

        System.out.print("Ano de nascimento: ");
        int ano = input.nextInt();
        healthProfile.setAno(ano);

        System.out.print("Informe seu peso: ");
        double peso = input.nextDouble();
        healthProfile.setPeso(peso);

        System.out.print("Informe sua altura: ");
        double altura = input.nextDouble();
        healthProfile.setAltura(altura);

        System.out.println();

        System.out.println("*****Dados do Usuário*****");
        System.out.printf("Nome: %s %s%n", healthProfile.getNome(), healthProfile.getSobrenome());
        System.out.println("Imc: " + String.format("%.1f", healthProfile.imc()));
        System.out.println("Frequência cardiaca maxíma: " + healthProfile.frequenciaMaxima());
        System.out.println("Frenquência cardiaca alvo: " + String.format("%.1f", healthProfile.frequenciaAlvo()));


        input.close();

    }
}
