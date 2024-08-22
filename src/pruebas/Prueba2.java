/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import clases.Matrices;

/**
 *
 * @author sebastian
 */
public class Prueba2 {

    public static void main(String[] args) {

        Matrices m = new Matrices();

        //-----------------------------------------------------------------------------------
        System.out.println("Muestra todas las conecciones de ese nodo");
        System.out.println("El nodo seleccionado es el 3");
        System.out.println("Por fila: ");
        // Matriz Adyacencia
        for (int i = 0; m.getMatrizAdyacencia().length > i; i++) {
            System.out.print(m.getMatrizAdyacencia()[3 - 1][i] + " ");
        }
        System.out.println("");
        // Matriz Coeficiencia
        for (int i = 0; m.getMatrizAdyacencia().length > i; i++) {
            System.out.print(m.getMatriz()[3 - 1][i] + " ");
        }
        System.out.println("");
        System.out.println("Por columna: ");
        // Matriz Adyacencia
        for (int i = 0; m.getMatrizAdyacencia()[0].length > i; i++) {
            System.out.print(m.getMatrizAdyacencia()[i][3 - 1] + " ");
        }
        System.out.println("");
        // Matriz Coeficiencia
        for (int i = 0; m.getMatrizAdyacencia()[0].length > i; i++) {
            System.out.print(m.getMatriz()[i][3 - 1] + " ");
        }
        System.out.println("");
        //-----------------------------------------------------------------------------------

        System.out.println("Eliminar el nodo 3");
        m.eliminarNodo(3);

        //-----------------------------------------------------------------------------------
        System.out.println("");
        System.out.println("Muestra todas las conecciones de ese nodo tras la eliminacion del nodo 3");
        System.out.println("Por fila: ");
        // Matriz Adyacencia
        for (int i = 0; m.getMatrizAdyacencia().length > i; i++) {
            System.out.print(m.getMatrizAdyacencia()[3 - 1][i] + " ");
        }
        System.out.println("");
        // Matriz Coeficiencia
        for (int i = 0; m.getMatrizAdyacencia().length > i; i++) {
            System.out.print(m.getMatriz()[3 - 1][i] + " ");
        }
        System.out.println("");
        System.out.println("Por columna: ");
        // Matriz Adyacencia
        for (int i = 0; m.getMatrizAdyacencia()[0].length > i; i++) {
            System.out.print(m.getMatrizAdyacencia()[i][3 - 1] + " ");
        }
        System.out.println("");
        // Matriz Coeficiencia
        for (int i = 0; m.getMatrizAdyacencia()[0].length > i; i++) {
            System.out.print(m.getMatriz()[i][3 - 1] + " ");
        }
        System.out.println("");
        //-----------------------------------------------------------------------------------

        System.out.println("");
        System.out.println("Muestra todas las conecciones de ese nodo tras la adicion del nodo 6");
        System.out.println("Por fila: ");
        // Matriz Adyacencia
        for (int i = 0; m.getMatrizAdyacencia().length > i; i++) {
            System.out.print(m.getMatrizAdyacencia()[3 - 1][i] + " ");
        }
        System.out.println("");
        // Matriz Coeficiencia
        for (int i = 0; m.getMatrizAdyacencia().length > i; i++) {
            System.out.print(m.getMatriz()[3 - 1][i] + " ");
        }
        System.out.println("");
        System.out.println("Por columna: ");
        // Matriz Adyacencia
        for (int i = 0; m.getMatrizAdyacencia()[0].length > i; i++) {
            System.out.print(m.getMatrizAdyacencia()[i][3 - 1] + " ");
        }
        System.out.println("");
        // Matriz Coeficiencia
        for (int i = 0; m.getMatrizAdyacencia()[0].length > i; i++) {
            System.out.print(m.getMatriz()[i][3 - 1] + " ");
        }
        System.out.println("");
    }
    
    //aa

}
