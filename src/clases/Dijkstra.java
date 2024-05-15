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

    /**
     * Constructor por defecto que inicializa los atributos de la matriz y el
     * numVertices, basandose en la matriz proporcionada.
     *
     * @param matriz matriz de adyacencia.
     */
    public Dijkstra(int[][] matriz) {
        this.matriz = matriz;
        this.numVertices = matriz.length;
    }

    /**
     * Este metodo implementa el algoritmo Dijkstra para calcular la ruta mas
     * corta desde un nodo inicial a todos los demas nodos.
     *
     * @param inicio nodo inicial.
     * @return ruta mas corta con los nodos por los que pasa.
     */
    public Resultado calcularRutaMasCorta(int inicio) {
        int[] distancias = new int[numVertices]; // Arreglo que guarda la distancia mas corta desde el nodo inicial a cada nodo.
        int[] predecesores = new int[numVertices]; // Arreglo que guarda el nodo previo en la ruta mas corta hacia cada nodo.
        Arrays.fill(distancias, Integer.MAX_VALUE);
        Arrays.fill(predecesores, -1);
        distancias[inicio] = 0;

        PriorityQueue<Nodo> pq = new PriorityQueue<>(numVertices, (a, b) -> Integer.compare(a.distancia, b.distancia));
        pq.add(new Nodo(inicio, 0)); // Cola de prioridad que ayuda a seleccionar el siguiente nodo en menor distancia.

        boolean[] visitados = new boolean[numVertices]; // Arreglo que indica si un nodo ha sido visitado.

        while (!pq.isEmpty()) { // Este while itera mientras haya nodos en la cola de prioridad.
            int nodoActual = pq.poll().nodo; // Extrae el nodo con la menor distancia.

            if (visitados[nodoActual]) { // Si ya ha sido visitado, se continua con el siguiente nodo.
                continue;
            }
            visitados[nodoActual] = true;

            for (int i = 0; i < numVertices; i++) {
                int distancia = matriz[nodoActual][i];
                // Para cada nodo adyacente, si se encuentra una ruta mas corta, se actualizan las distancias y predecesores, y se añade el nodo a la
                // cola de prioridad.
                if (distancia > 0 && !visitados[i] && distancias[nodoActual] + distancia < distancias[i]) {
                    distancias[i] = distancias[nodoActual] + distancia;
                    predecesores[i] = nodoActual;
                    pq.add(new Nodo(i, distancias[i]));
                }
            }
        }

        return new Resultado(distancias, predecesores);
    }

    /**
     * Esta clase encapsula un nodo y su distancia asociada, usada en la cola de
     * prioridad.
     */
    private static class Nodo {

        int nodo;
        int distancia;

        public Nodo(int nodo, int distancia) {
            this.nodo = nodo;
            this.distancia = distancia;
        }
    }

    /**
     * Esta clase encapsula los resultados del algoritmo (las distancias mas
     * cortas y los predecesores) para cada nodo.
     */
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
