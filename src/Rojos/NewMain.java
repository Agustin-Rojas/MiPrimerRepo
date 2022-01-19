/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojos;

/**
 *
 * @author agusr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    public static boolean buscador(int[][] matrizM, int[][] matrizP, int D, int d) {
        boolean logico = false;

        // for comparador de valores
        
        int filas=0;
        int columna=0;
        
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < D; j++) {
                if (matrizM[i][j] == matrizP[0][0] && i < D - d || j < D - d) {  //cambiar a donde esta el otro if
                    
                    filas=i;
                    columna=j;

                    for (int k = 0; k < d; k++) {
                        for (int l = 0; l < d; l++) {
                            if (matrizM[filas][columna] == matrizP[k][l]) {
                                logico = true;
                            } else {
                                logico = false;
                                break;
                            }
                            columna++;
                        }
                        filas++;
                    }
                }
            }
        }
        return logico;
    }
}
