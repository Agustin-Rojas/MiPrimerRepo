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
public class CUADRADOASTERISCOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        System.out.println("Ingrese el tamaño de su cuadro");
        int n = leer.nextInt();
        while (n < 2) {
            System.out.println("Ingrese un tamaño mas grande");
            n = leer.nextInt();

        }

        for (int i = 0; i < n  ; i++) {
            for (int j = 0; j < n-1 ; j++) {
                
                if(i ==0 || i== n-1){
                    System.out.print("*");
                }else if (j == 0 || j == n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        
    }

}
