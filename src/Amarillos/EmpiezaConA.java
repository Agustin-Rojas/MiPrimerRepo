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
public class EmpiezaConA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
         Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
         
         System.out.println("escriba una frase que empieza con A");
         String frase= Leer.next();
         String  A = "A";
         
         if(frase.startsWith( "A") ){
         System.out.println("Correcto");
         }else{
         System.out.println("Incorrecto");
         }
         
    }
    
}
