package Modulo2.EntradaSaidaOperadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Fábio
 */
public class Addition {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.println("Enter first integer");
        number1 = in.nextInt();
        
        System.out.println("Enter second integer");
        number2 = in.nextInt();
        
        sum = number1 + number2;
        
        System.out.println("Sum is " + sum);
        
        
        in.close();
    }
    
}
