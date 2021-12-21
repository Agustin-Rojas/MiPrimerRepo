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
public class FraseMayusculasYMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java. */
        
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("/n").useLocale(Locale.US);
        
        System.out.println(" Ingrese una frase y terminela con punto");
        String frase = Leer.next( );
    
        System.out.println(frase.toUpperCase());
        
         System.out.println(frase.toLowerCase());
    }
    
}
