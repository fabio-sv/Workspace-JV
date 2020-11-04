/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.EntradaSaidaOperadores;

import java.util.Scanner;

/**
 *
 * @author Fábio
 */
public class Comparison {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.println("Enter first integer");
        number1 = in.nextInt();
        
        System.out.println("Enter second integer");
        number2 = in.nextInt();
       
        if (number1 == number2){
            System.out.println(number1 + " == " + number2);
        }
        
        if (number1 != number2){
            System.out.println(number1 + " != "+ number2);
        }
        if (number1 < number2){
            System.out.println(number1 + " < " + number2);
        }
        
        if (number1 > number2){
            System.out.println(number1 + " > " + number2);
        }
        
        if (number1 <= number2){
            System.out.println(number1 + " <= " + number2);
        }
        
        if (number1 >= number2){
            System.out.println(number1 + " >= "+ number2);
        }
        
        in.close();
    }
    
}

