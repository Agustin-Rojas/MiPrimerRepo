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
public class PedirYMostrarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla */
           Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
           
           
           
           System.out.println("Escriba su nombre y apellido");
           String Nombre = Leer.next( );
           System.out.println("Hola, " + Nombre );
    }
}
