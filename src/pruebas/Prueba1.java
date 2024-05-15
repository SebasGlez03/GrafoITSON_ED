/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import clases.Matrices;

/**
 *
 * @author sebas
 */
public class Prueba1 {

    public static void main(String[] args) {

        Matrices m = new Matrices();

        System.out.println("Cant. filas: " + m.getMatriz().length);
        System.out.println("Cant. columnas: " + m.getMatriz()[0].length);
        System.out.println("");

        System.out.println("Obtener distancia con m.getMatriz[dato][dato]");
        System.out.println("Dato que se encuentra en la posicion (3,2) de la matriz: " + m.getMatriz()[3][2]);
        System.out.println("Dato que se encuentra en la posicion (1,1) de la matriz: " + m.getMatriz()[1][1]);
        System.out.println("");

        System.out.println("Obtener distancia con metodo obtenerDato");
        System.out.println("Dato que se encuentra en la posicion (3,2) de la matriz: " + m.obtenerDistancia(3, 2));
        System.out.println("Dato que se encuentra en la posicion (1,1) de la matriz: " + m.obtenerDistancia(1, 1));

    }

}
