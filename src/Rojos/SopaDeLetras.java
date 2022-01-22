/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojos;

import static Rojos.MatrizMagica.MostrarMatriz;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*. 23 Extra. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con un 
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras 
creada*/

        String[][] Matriz = new String[20][20];

        CargarMatrizEspacio(Matriz, 20, 20);

        int contador = 0;
        int fila;
        int columna;

        boolean bandera = false;
        String pal;

        do {
            fila = (int) (Math.random() * 20);

            if (" ".equals(Matriz[fila][0])) {

                do {
                    columna = (int) (Math.random() * 15);

                    if (" ".equals(Matriz[fila][columna])) {

                        pal = PedirPalabras();

                        for (int j = 0; j < 20; j++) {
                            switch (pal.length()) {
                                case 3:
                                    if (j <= 2) {
                                        Matriz[fila][j + columna] = pal.substring(j, j + 1);
                                    }
                                    break;
                                case 4:
                                    if (j <= 3) {
                                        Matriz[fila][j + columna] = pal.substring(j, j + 1);
                                    }
                                    break;
                                case 5:
                                    if (j <= 4) {
                                        Matriz[fila][j + columna] = pal.substring(j, j + 1);
                                    }
                                    break;

                            }
                        }

                        contador++;
                        bandera = true;
                    }

                } while (bandera == false);

                bandera = true;

            }

        } while (contador < 5);

        int nroInt;
        String nroString;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (Matriz[i][j].equals(" ")) {
                    nroInt = (int) (Math.random() * 10);
                    nroString = String.valueOf(nroInt);

                    Matriz[i][j] = nroString;
                }

            }
        }
        MostrarMatriz(Matriz, 20, 20);

    }

    public static void MostrarMatriz(String matriz[][], int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (j == columnas - 1) {
                    System.out.println("|" + matriz[i][j] + "|");
                } else {
                    System.out.print("|" + matriz[i][j]);
                }
            }
        }

    }

    public static String PedirPalabras() {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        String palabra = "";

        do {

            System.out.println("Ingrese una palabra de 3-5 caracteres cada una");

            palabra = Leer.next();
        } while (palabra.length() < 3 || palabra.length() > 5);
        return palabra;
    }

    public static void CargarMatrizEspacio(String matriz[][], int filas, int columnas) {
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = " ";
            }
        }

    }

}
