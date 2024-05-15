/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import clases.Dijkstra;
import clases.MatrizAdyacencia;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sebas
 */
public class Prueba2 {

    public static void main(String[] args) {
        MatrizAdyacencia matrizAdyacencia = new MatrizAdyacencia();
        int[][] matriz = matrizAdyacencia.getMatriz();
        Dijkstra dijkstra = new Dijkstra(matriz);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el edificio de origen (1-15): ");
        int origen = scanner.nextInt() - 1;  // Convertimos a índice de matriz (0-14)

        System.out.println("Seleccione el edificio de destino (1-15): ");
        int destino = scanner.nextInt() - 1;  // Convertimos a índice de matriz (0-14)

        Dijkstra.Resultado resultado = dijkstra.calcularRutaMasCorta(origen);
        int[] distancias = resultado.getDistancias();
        int[] predecesores = resultado.getPredecesores();
        int distanciaMasCorta = distancias[destino];

        if (distanciaMasCorta == Integer.MAX_VALUE) {
            System.out.println("No hay una ruta disponible desde el edificio " + (origen + 1) + " al edificio " + (destino + 1));
        } else {
            System.out.println("La distancia mas corta desde el edificio " + (origen + 1) + " al edificio " + (destino + 1) + " es " + distanciaMasCorta + " metros.");

            Stack<Integer> ruta = new Stack<>();
            for (int i = destino; i != -1; i = predecesores[i]) {
                ruta.push(i);
            }

            System.out.println("");
            System.out.print("[ Ruta: ");
            while (!ruta.isEmpty()) {
                System.out.print((ruta.pop() + 1) + " ");
            }
            System.out.print("]");
            System.out.println("");
        }

        scanner.close();
    }
}
