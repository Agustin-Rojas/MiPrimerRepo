/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amarillos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class NotaEntre0y10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. */
        
        Scanner Leer = new Scanner (System.in, "ISO-8859-1").useLocale(Locale.US);
                
       int Nota= 15 ;
       do {
           System.out.println("Ingrese la nota entre 0 y 10 ");
        Nota= Leer.nextInt();
       }while(Nota < 0 || Nota >10);
       
       
    }
    
}
