/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verdes;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author agusr
 */
public class DeCelciusAFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/
        
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        System.out.println("Ingrese la temperatura en grados C° ");
        
        double C= Leer.nextDouble();
        
        System.out.println("Equivale a : F° "+ (32 + (9* C/5)));
       
        
        
        
        
    }
    
}
