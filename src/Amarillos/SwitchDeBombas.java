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
public class SwitchDeBombas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* . Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una 
bomba de agua”. 
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una 
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una 
bomba de hormigón”. 
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una 
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No 
existe un valor válido para tipo de bomba” */
        
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        int n= 0;
        do {
            System.out.println("Ingrese un numero entre el 1 y 4");
            n=Leer.nextInt();
        }while (n <1 || n >4);
        
        switch (n){
            case 1:
                System.out.println("La bomba es una bomba de agua") ;
                        break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina") ;
                        break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon") ;
                        break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimentacia") ;
                        break;
            default:
                System.out.println("No existe un valor valido para ese tipo de bomba") ;
                        break;
        }
                
       
        
        
        
    }
    
}
