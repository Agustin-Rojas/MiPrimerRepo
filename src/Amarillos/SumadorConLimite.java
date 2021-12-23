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
public class SumadorConLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. */

        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        
        System.out.println("ingrese un numero limite");
        int limite = Leer.nextInt();
        int sumador=0;
        
        while(sumador<limite){
        
        System.out.println("ingrese un numero ");
         sumador = sumador + ( Leer.nextInt());
        }
        
        

    }
}
