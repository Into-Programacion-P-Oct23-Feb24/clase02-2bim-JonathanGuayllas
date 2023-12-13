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
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        // declaro el arreglo en la misma línea
        int[] arreglo1 = new int[5];
        
        // arreglo de tipo entero
        // declaro primero la variable y posteriormente el arreglo
        int[] arreglo2;
        arreglo2 = new int[5];
        
        // arreglo de tipo entero - 5 elementos
        // declaro el arreglo y los valores que tiene cada elemento del arreglo
        int[] arreglo3 = {5, 10, 15, 20, 25}; // sin new
        
        // arreglo de doubles - 3 elementos
        double[] arreglo4 = {5.1, 10.2, 15.2}; // sin new
        
        // arreglo de cadenas - 4 elementos
        // declaro un arreglo tipo cadena y le doy un texto a cada elemento
        String[] arreglo5 = {"Loja", "Quito", "Zamora", "Machala"};
    }

}
