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
public class SumadorHasta0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break. */ 
        
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        int Sumador= 0;
        int fin = 1;
        while( fin != 0) {
            System.out.println("Ingrese un numero");
            int n= leer.nextInt();
            if (n==0){
                System.out.println("Se capturo el numero 0");
            break;}else if (n>0){
            Sumador=Sumador+n;
            System.out.println("La suma es: " + Sumador);}
            
        }
                
    
}
}