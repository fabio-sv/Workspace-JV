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
public class Exercicio2_5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        System.out.println("Enter second integer: ");
        int y = in.nextInt();
        System.out.println("Enter third integer: ");
        int z = in.nextInt();
        
        int result = x * y * z;
        
        System.out.println("Product is " + result);
        
        
        in.close();
    }
    
}
