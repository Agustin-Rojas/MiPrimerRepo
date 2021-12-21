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
public class pedirNumerosYSumar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma */
        
        
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        
        System.out.println("Por favor ingrese un numero");
        int n1 = Leer.nextInt();
        System.out.println("Ahora ingrese otro numero");
        int n2= Leer.nextInt();
        
        System.out.println("La suma de los numeros ingresados es de: " + (n1+n2));
                
               
        
        






    }
    
}
