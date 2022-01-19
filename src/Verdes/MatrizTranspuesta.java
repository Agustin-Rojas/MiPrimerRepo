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
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /* 23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz.*/
        Scanner Leer = new Scanner(System.in,"ISO-8859-1"). useLocale(Locale.US);
        
        int[][] Matriz = new int [4][4];
        CargarMatriz(Matriz, 4,4);
         MostrarMatriz(Matriz, 4,4);
         System.out.println("");
        MostrarMatrizTranspuesta(Matriz, 4,4);
    }
    /////////////////MOSTRAR MATRIZ TRANSPUESTA///////////////////////
    public static void MostrarMatrizTranspuesta(int matriz[][], int filas, int columnas ){
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                
                if(j==filas-1){
                System.out.println(matriz[j][i]+ " ");
                }else {
                System.out.print (matriz[j][i]+ " ");
                }
            }
        }
        
    }
    ////////////////////////CARGAR MATRIZ NORMAL///////////////
    public static void CargarMatriz(int matriz[][], int filas, int columnas ){
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]= (int) Math.floor(Math.random()*10);
            }
        }
        
    }
    /////////////////MOSTRAR MATRIZ NORMAL///////////////////////
    public static void MostrarMatriz(int matriz[][], int filas, int columnas ){
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                if(j==columnas-1){
                System.out.println(matriz[i][j]+ " ");
                }else {
                System.out.print (matriz[i][j]+ " ");
                }
            }
        }
        
    }
}
