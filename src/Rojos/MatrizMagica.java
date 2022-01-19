/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojos;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in,"ISO-8859-1"). useLocale(Locale.US);
        System.out.println("ingrese el tamaño de su cuadrado");
        int tamanio = Leer.nextInt();
        
        
        
        
        int[][] Matriz = new int [tamanio][tamanio];
        CargarMatriz(Matriz, tamanio,tamanio);
         MostrarMatriz(Matriz, tamanio,tamanio);
         System.out.println("");
         validador(Matriz, tamanio);
        
        
    }
    ////////////////////////CARGAR MATRIZ manual///////////////
    public static void CargarMatriz(int matriz[][], int filas, int columnas ){
        Scanner Leer = new Scanner(System.in,"ISO-8859-1"). useLocale(Locale.US);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor de la posicion n°: " + (i+1)+"."+(j+1));
                matriz[i][j]= Leer.nextInt();
            }
        }
        
    }
    /////////////////MOSTRAR MATRIZ NORMAL///////////////////////
    public static void MostrarMatriz(int matriz[][], int filas, int columnas ){
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                if(j==columnas-1){
                System.out.println("|" +matriz[i][j]+ "|");
                }else {
                System.out.print ("|"+matriz[i][j]);
                }
            }
        }
        
    }
    
    public static void validador (int matriz[][], int tamanio ){
        
        
        
        /* creamos un vector para los resultados de las sumas, el tamaño es la cantidad de columnas + filas + 2 diagonales*/
        int tVector=  tamanio+tamanio+2;
        int[] mResultados= new int[tVector];
        
        /* cargamos el vector con 0 para darle un inicio, porque va a guardar sumas como un contador, asi que necesita inicializacion*/
        for (int i = 0; i < tVector; i++) {
            mResultados[i]= 0;
        }
        /* un contador para la posicion que se recorre*/
        int posicion=0;
        
        for (int i = 0; i < tamanio; i++) {
            
            
            for (int j = 0; j < tamanio; j++) {
                mResultados[posicion]= mResultados[posicion]+ matriz[i][j]; /*guardamos en la primeras n posiciones las sumas de las  filas*/
            mResultados[(tamanio+posicion)]= mResultados[(tamanio+posicion)] + matriz[j][i]; /*en las posiciones siguientes a n guardamos las columnas*/
            }
            
            
            posicion++; /*despues de guardar todos los datos de una fila y una columna avanzamos una posicion del vector
		         para  guardar otra columna y fila*/
            mResultados[tVector-2]= mResultados[tVector-2]+ matriz[i][i]; /* guardamos la primera diagonal*/
		mResultados[tVector-1]=mResultados[tVector-1]+ matriz[i][(tamanio-1)-i];/* guardamos la diagonal secundaria*/
        
        }
        
        for (int i = 0; i < tVector; i++) {
            System.out.print("-"+ mResultados[i]);/*escribimos el contenido de mResultados para comprobar los resultados guardados en el vector*/
            
        }
        System.out.println("");
        int recorredorVector=0;
        boolean flag= true;
        
        while( recorredorVector<tamanio+ tamanio+1){    /*comprobamos que cada posicion dentro del vector sea igual al siguiente*/
        if(mResultados[recorredorVector]!= mResultados[recorredorVector+1]){/*si en alguna parte del vector se encuentra a un valor diferente se convierte en falso*/
        flag=false;
        }
        recorredorVector++;
        }
        
        
        if (flag==true){
        System.out.println("La matriz es magica, la suma evaluada es: " + mResultados[1]);
        }else {
        System.out.println("No es magica");
        }
    }
}