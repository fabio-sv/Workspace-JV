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
public class Exercicio2_8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer:\t");
        int a = in.nextInt();
        
        int b = 10;
        int c = 20;
        
        a = b * c;
        
        System.out.println(a);
        
        
        
        
        
        in.close();
    }
    
}
