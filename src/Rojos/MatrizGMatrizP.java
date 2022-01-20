/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojos;

import static Rojos.MatrizMagica.CargarMatriz;
import static Rojos.MatrizMagica.MostrarMatriz;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class MatrizGMatrizP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P.*/
        int[][] MatrizG = new int[10][10];
        int[][] MatrizP = new int[3][3];

        CargarMatrizRandom(MatrizG, 10, 10);
        MostrarMatriz(MatrizG, 10, 10);
        CargarMatriz(MatrizP, 3, 3);
        System.out.println("");
        MostrarMatriz(MatrizG, 10, 10);
        MostrarMatriz(MatrizP, 3, 3);
        buscador(MatrizG, MatrizP, 10, 3);

    }//////////////////////////////////BUSCADOR//////////////////////////////

    public static void buscador(int[][] matrizM, int[][] matrizP, int D, int d) {

        boolean logico = false;

        // for comparador de valores
        int filas = 0;
        int columna = 0;
        int contadorP = 0;
        
        
        
        
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < D; j++) {
                if (matrizM[i][j] == matrizP[0][0] && i <= (D-1) - (d-1) || j <= (D-1) - (d-1)) {

                    filas = i;
                    columna = j;
                    logico = false;
                    contadorP = 0;

                    for (int k = 0; k < d; k++) {
                        for (int l = 0; l < d; l++) {
                            if (matrizM[filas][columna] == matrizP[k][l] ) {
                                contadorP++;///contamos cuantas posiciones son iguales en ambas matrices

                                if (contadorP == 9) {
                                    System.out.printf("La matriz fue encontrada en la posicion |%d |%d|  ", i, j);
                                    break;
                                }
                            } else {
                                logico = true;

                            }
                            if(columna<9){
                        columna++;
                        }
                            
                        }
                        columna = j;
                        if(filas<9){
                        filas++;
                        }
                    }
                }
            }
        }
        
        if(logico == true && contadorP != 9){
        System.out.println("La matriz pequeña no fue encontrada");
        }

    }

////////////////////cargar manual///////////////////////////
    public static void CargarMatriz(int matriz[][], int filas, int columnas) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor de la posicion n°: " + (i + 1) + "." + (j + 1));
                matriz[i][j] = Leer.nextInt();
            }
        }

    }////////////////////cargar random////////////////////////////

    public static void CargarMatrizRandom(int matriz[][], int filas, int columnas) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

    }

}
