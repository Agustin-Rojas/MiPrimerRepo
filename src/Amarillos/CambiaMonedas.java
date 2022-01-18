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
public class CambiaMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        System.out.println("¿A que monedas quiere convertir sus pesos?");
        System.out.println(" A. Dolares");
        System.out.println(" B. Reales");
        System.out.println(" C. Euros");
        String moneda = Leer.next();
        
        
        while (!"A".equals(moneda) && !"B".equals(moneda) && !"C".equals(moneda)) {
            System.out.println("ingrese una opcion valida");
            System.out.println(" A. Dolares");
            System.out.println(" B. Reales");
            System.out.println(" C. Euros");
            moneda = Leer.next();
        }
        
        
        
             System.out.println("Ingrese el monto a convertir");  
             int monto = Leer.nextInt();
             
             cambiador(moneda,monto);
             
        
    }
    
    ///////////////////////////Subproceso cambiador//////////////////
    private static void cambiador(String mon, int mont){
        
        double dolares = mont * 0.0096;
        double reales = mont * 0.053;
        double euros = mont * 0.0084;

        
        
        
        switch (mon){
            case "A":
                System.out.println(mont + " AR$ es igual a: " + dolares + " U$D" );
                        break;
            case "B":
                System.out.println(mont + " AR$ es igual a: " + reales + " R$" );
                        break;
            case "C":
                System.out.println(mont + " AR$ es igual a: " + euros + " €" );
                        break;
            
        }
        
        
}
}



