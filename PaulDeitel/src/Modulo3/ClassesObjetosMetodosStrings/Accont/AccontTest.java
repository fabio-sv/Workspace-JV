package Modulo3.ClassesObjetosMetodosStrings.Accont;

import Modulo3.ClassesObjetosMetodosStrings.Accont.Accont;

import java.util.Scanner;

/**
 *
 * @author Fábio
 * 
 * page 103,104
 */
public class AccontTest {
    public static void main(String[] args) {
        
        //Instânciando objeto a classe
        Accont Accont1 = new Accont("jane green", 50.00);
        Accont Accont2 = new Accont("jhon blue", -7.53);
        
        //Exibe o saldo inicial de cada objeto
        System.out.println(Accont1.getName() + " " + Accont1.getBalance());
        System.out.println(Accont2.getName() + " " + Accont2.getBalance()); 
        System.out.println();
        
        //Ler dados do usuário
        Scanner input = new Scanner(System.in);
        
        //Entrada de dados para realizar depósito
        System.out.print("Enter deposit amount for accont1 :");
        double depositAmount = input.nextDouble();
        
        System.out.printf("%nAdding %.2f to accont1 balance%n%n", depositAmount);//Informa o valor do depósito
        Accont1.deposit(depositAmount);//add o valor da var depositAmount ao obj Accont1
        
        // exibe o saldo
        System.out.printf("%s balance $%.2f %n",
                Accont1.getName(), Accont1.getBalance());
        System.out.printf("%s balance $%.2f %n%n", 
                Accont2.getName(), Accont2.getBalance());
        
        System.out.print("Enter deposit amount for accont2: ");
        double depositAmount1 = input.nextDouble();
        Accont2.deposit(depositAmount1);
        System.out.printf("%nAdding %.2f to accont1 balance%n%n", depositAmount1);//Informa o valor do depósito
       
        
        System.out.printf("%s balance $%.2f %n",
                Accont1.getName(), Accont1.getBalance());
        System.out.printf("%s balance $%.2f %n",
                Accont2.getName(), Accont2.getBalance());
        
        input.close();
    }
    
}
