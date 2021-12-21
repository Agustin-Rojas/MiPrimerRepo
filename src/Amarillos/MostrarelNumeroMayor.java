/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amarillos;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author agusr
 */
public class MostrarelNumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla */
        
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        System.out.println("ingrese un numero");
        int n1= Leer.nextInt();
        System.out.println("ingrese otro numero");
        int n2= Leer.nextInt();
        
        
        if (n1>n2){
            System.out.println("El numero mayor es: " + n1);
            
        }
        else if (n1==n2){
            System.out.println("Los numeros son iguales");
        }
        else {
            System.out.println("El numero mayos es: "+ n2);
        }
        
    }
    
}
