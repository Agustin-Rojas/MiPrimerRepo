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
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Crear un programa que dado un numero determine si es par o impar.
         Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
         
         System.out.println("ingrese un numero");
         int n= Leer.nextInt();
         
        if (n % 2 == 0){
        System.out.println("Es Par");
        }else {
        System.out.println("Es Impar");
        }
        
        
        
    }
    
}
