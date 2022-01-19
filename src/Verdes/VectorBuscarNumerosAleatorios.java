/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verdes;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class VectorBuscarNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        /*  21.  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido*/
        
        
        System.out.println("Ingrese el tamaño del vector");
        
        int tam = Leer.nextInt();
        int[] Vector = new int[tam];
        
        CargarVector(tam, Vector);
        MostrarVector( tam, Vector);
        System.out.println("");
        System.out.println("¿Que numero desea buscar?");
        
        int n = Leer.nextInt();
        BuscarNumEnVector (tam, Vector, n);
        
        
    }
    /////////////////////////////////////BUSCAR////////////////////////////
    public static void BuscarNumEnVector (int tam,int vector[], int n){
     int repetidos = 0;
     
     System.out.println("El numero " + n + " fue encontrado en la/s posicion/es: " );
     
        for (int i = 0; i < tam; i++) {
            
            if( vector[i]== n){
                
                System.out.print( i+ " ");
                repetidos++;
            }
            
        }
        System.out.println("");
        
        if(repetidos ==1){
             System.out.println(" El numero no esta repetido");
        }else {
        System.out.println(" Esta repetido "+ repetidos + " veces.");
        }
    }
    ///////////////////////////////////////////CARGAR/////////////////////////////////////
    public static void CargarVector (int tam,int vector[]){
        ///////carga numeros enteros aleatorios entre el 0 y 99//////
        for (int i = 0; i < tam; i++) {
            
            vector[i]= (int) Math.floor(Math.random()* 10);
            
        }
    
        
        
        
    }
    ////////////////////////////////////MOSTRAR////////////////////////////////
    public static void MostrarVector (int tam,int vector[]){
        ///////carga numeros enteros aleatorios entre el 0 y 99//////
        for (int i = 0; i < tam; i++) {
            
            System.out.print(vector[i] + "|");
            
        }
    
        
        
        
    }
}
