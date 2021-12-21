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
public class DobleTripleYRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt(). */
        
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        System.out.println("Ingrese un numero");
        int n= Leer.nextInt();
        System.out.println("Doble: "+ (n*2));
        System.out.println("Triple: "+ (n*3));
        System.out.println("Raiz Cuadrada: " + (Math.sqrt(n)));
        
    }
    
}
