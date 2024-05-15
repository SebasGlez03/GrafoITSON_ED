/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * @author sebas
 */
public class Dijkstra {

    private int[][] matriz;
    private int numVertices;

    public Dijkstra(int[][] matriz) {
        this.matriz = matriz;
        this.numVertices = matriz.length;
    }

    public Resultado calcularRutaMasCorta(int inicio) {
        int[] distancias = new int[numVertices];
        int[] predecesores = new int[numVertices];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        Arrays.fill(predecesores, -1);
        distancias[inicio] = 0;

        PriorityQueue<Nodo> pq = new PriorityQueue<>(numVertices, (a, b) -> Integer.compare(a.distancia, b.distancia));
        pq.add(new Nodo(inicio, 0));

        boolean[] visitados = new boolean[numVertices];

        while (!pq.isEmpty()) {
            int nodoActual = pq.poll().nodo;

            if (visitados[nodoActual]) {
                continue;
            }
            visitados[nodoActual] = true;

            for (int i = 0; i < numVertices; i++) {
                int distancia = matriz[nodoActual][i];
                if (distancia > 0 && !visitados[i] && distancias[nodoActual] + distancia < distancias[i]) {
                    distancias[i] = distancias[nodoActual] + distancia;
                    predecesores[i] = nodoActual;
                    pq.add(new Nodo(i, distancias[i]));
                }
            }
        }

        return new Resultado(distancias, predecesores);
    }

    private static class Nodo {

        int nodo;
        int distancia;

        public Nodo(int nodo, int distancia) {
            this.nodo = nodo;
            this.distancia = distancia;
        }
    }

    public static class Resultado {

        private int[] distancias;
        private int[] predecesores;

        public Resultado(int[] distancias, int[] predecesores) {
            this.distancias = distancias;
            this.predecesores = predecesores;
        }

        public int[] getDistancias() {
            return distancias;
        }

        public int[] getPredecesores() {
            return predecesores;
        }
    }
}
