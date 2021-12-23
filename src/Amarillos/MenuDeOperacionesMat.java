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
public class MenuDeOperacionesMat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*. Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú*/

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        System.out.println("Ingrese el primer numero");
        int n1 = leer.nextInt();
        System.out.println("Ahora ingrese otro numero");
        int n2 = leer.nextInt();
        boolean fin = false;
        int resultado = 0;

        while (fin == false) {
            {
               
                System.out.println("--------MENU--------");
                System.out.println("|1.Sumar            |");
                System.out.println("|2.Restar           |");
                System.out.println("|3.Multiplicar      |");
                System.out.println("|4.Dividir          |");
                System.out.println("|5.Salir            |");
                System.out.println("---------------------");
                int opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        resultado = n1 + n2;
                        System.out.println("La suma de " + n1 + " + " + n2 + " es igual a: " + resultado);
                        continue;
                    case 2:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        resultado = n1 - n2;
                        System.out.println("La resta de " + n1 + " - " + n2 + " es igual a: " + resultado);
                        continue;
                    case 3:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        resultado = n1 * n2;
                        System.out.println("La multiplicacion de " + n1 + " * " + n2 + " es igual a: " + resultado);
                        continue;
                    case 4:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        resultado = n1 / n2;
                        System.out.println("La division de " + n1 + " / " + n2 + " es igual a: " + resultado);
                        continue;
                    case 5:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println(" ¿Esta Seguro de que quiere salir? (Y/N)");
                        String sn = leer.next();
                        
                        
                        if (sn.equals("Y") || sn.equals("y")) {
                            fin = true;
                            break;

                        }else{
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");}
                }

            }
        }

    }

}
