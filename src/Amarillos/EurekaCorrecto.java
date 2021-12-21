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
public class EurekaCorrecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* . Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.*/
        
         Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
         
         System.out.println("Escriba la clave");
         
         String frase= Leer.next();
         String clave= "Eureka";
         if (clave.equals(frase)){
        System.out.println("Correcto");
    }else{
             System.out.println("Incorrecto");
         }
         
         
    }
    
}
