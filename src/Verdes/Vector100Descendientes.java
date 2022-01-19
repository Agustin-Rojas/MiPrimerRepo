/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verdes;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class Vector100Descendientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("/n").useLocale(Locale.US);
        
        
        System.out.println("Bienvenido al contador decreciente");
        int[] Vector = new int[100];
        
        for (int i = 100; i >= 1; i--) {
            Vector[i-1]= i;
            System.out.println(Vector [i-1]);
          
        }
       
        
        
        
        
    }
}