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
public class Frasede8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
         Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        System.out.println("Escriba una frase de 8 caracteres");
        String frase= Leer.next();
        
        if (frase.length() != 8){
            System.out.println("Incorrecto. NO tiene 8 caracteres");
        }else{
            System.out.println("CORRECTO. FELICITACIONES");
        }
    }
    
}
