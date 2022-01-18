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
public class vectorCuentaDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        
        System.out.println("Ingrese la longitud del vector");
        int n= Leer.nextInt();
        
        int[] vector = new int[n];
        
         
        for (int i = 0; i < n; i++) {
           
            System.out.println(vector [i]= (int) Math.floor(Math.random()* 100000));
        }
        
        
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        int digito4 = 0;
        int digito5 = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] >= 0 && vector[i] <= 9) {
                digito1++;
            } else if (vector[i] >= 10 && vector[i] <= 99) {
                digito2++;

            } else if (vector[i] >= 100 && vector[i] <= 999) {
                digito3++;
            }else if (vector[i] >= 1000 && vector[i] <= 9999) {
                digito4++;
            }else if (vector[i] >= 10000 && vector[i] <= 99999) {
                digito5++;
            }

        }
        
        System.out.println(" 1 digito: " + digito1);
        System.out.println(" 2 digitos: " + digito2);
        System.out.println(" 3 digitos: " + digito3);
        System.out.println(" 4 digitos: " + digito4);
        System.out.println(" 5 digitos: " + digito5);

    }

}
