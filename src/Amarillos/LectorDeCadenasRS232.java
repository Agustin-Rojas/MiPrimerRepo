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
public class LectorDeCadenasRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* . Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
        
        
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        
        
        int correctos=0;
        int incorrectos=0;
        boolean flag=false;
        
        while(flag==false){
            System.out.println("ingrese la cadena");
            String cadena= leer.next();
            
            if( cadena.length()!= 5){
                if()
            }else{
            incorrectos++;}
            
        }
        
        
    }
    
}
