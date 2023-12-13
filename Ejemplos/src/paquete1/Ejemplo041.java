/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables acumuladoras
        String cadena = "";
        int suma = 0;
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        // int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        // System.out.println(arreglo1.length);
        // arreglo1[2] = 1000;
        // la palabra length cuando la agrego como característica de un
        // arreglo me da el total de elementos asociados al arreglo
        //              i < 5
        for (int i = 0; i < arreglo1.length; i++) {
            // la variable suma se suma con el elemento que tenga el arreglo
            suma = suma + arreglo1[i];
            // la cadena acumula la información
            cadena = String.format("%sSubíndice o Índice %d, con valor "
                    + "%d\n",
                    cadena,
                    i,
                    arreglo1[i]);
        }
        // termino de darle la información a la cadena
        cadena = String.format("%sLa suma total es: %d\n ",
                cadena,
                suma);
        // presento todo en mayúsculas usando (toUpperCase())
        System.out.println(cadena.toUpperCase());
    }

}
