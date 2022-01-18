/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizMagica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        System.out.println("ingrese el tamaño de su matriz");
        int tam = Leer.nextInt();

        while (tam > 10 || tam < 3) {
            System.out.println("el tamaño debe ser entre 3 y 10");
            tam = Leer.nextInt();
        }

        int[][] Matriz = new int[tam][tam];

        // ////////////////////////CARGAR/////////////
        for (int i = 0; i == tam - 1; i++) {
            for (int j = 0; j == tam - 1; i++) {
                Matriz[i][j] = 5;

                

            }
            
        }
        for (int i = 0; i == tam - 1; i++) {
            for (int j = 0; j == tam - 1; i++) {
                

                System.out.print("|" + Matriz[i][j] + "|");

            }
            System.out.println("fgf");
        }
        ////////////esto es una prueba aleatria de un vector///////////////
        int[] vector = new int[5];
        vector[0]= 5;
        
        

    }

}
