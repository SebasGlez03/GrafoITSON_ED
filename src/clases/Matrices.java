/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase para mostrar la matriz de adyacencia de los edificios ya existentes en
 * el campus
 *
 * @author sebas
 */
public class Matrices {

    /*
    1. LV-1500
    2. LV-1800
    3. LV-1200
    4. LV-1100
    5. TUTORIAS
    6. AV-1600
    7. LV-900
    8. AV-1500
    9. AV-1400
    10. LV-800
    11. LV-700
    12. VIDEOCONFERENCIAS
    13. AV-1300
    14. AV-1200
    15. AV-1100
    
    (se muestran las distancias en metros)
     */
    private int[][] matrizCoeficiencia = {
        {0, 38, 0, 0, 0, 119, 0, 0, 0, 146, 0, 0, 190, 0, 0},
        {38, 0, 57, 0, 0, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 57, 0, 42, 0, 32, 47, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 42, 0, 48, 64, 55, 34, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 48, 0, 0, 52, 33, 28, 0, 0, 0, 0, 0, 0},
        {119, 44, 32, 64, 0, 0, 22, 0, 0, 21, 28, 0, 0, 0, 0},
        {0, 0, 47, 55, 52, 22, 0, 15, 0, 19, 11, 23, 0, 0, 0},
        {0, 0, 0, 34, 33, 0, 15, 0, 13, 0, 15, 13, 0, 0, 0},
        {0, 0, 0, 0, 28, 0, 0, 13, 0, 0, 0, 11, 0, 0, 0},
        {146, 0, 0, 0, 0, 21, 19, 0, 0, 0, 17, 0, 23, 40, 0},
        {0, 0, 0, 0, 0, 28, 11, 15, 0, 17, 0, 14, 19, 22, 19},
        {0, 0, 0, 0, 0, 0, 23, 13, 11, 0, 14, 0, 0, 34, 20},
        {190, 0, 0, 0, 0, 0, 0, 0, 0, 23, 19, 0, 0, 14, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 22, 34, 14, 0, 15},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 20, 0, 15, 0}
    };

    private int[][] matrizAdyacencia = {
        {0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
        {1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0}
    };

    /**
     * Constructor por omision.
     */
    public Matrices() {

    }

    /**
     * Obtiene la matriz de coeficiencia.
     *
     * @return matriz de coeficiencia.
     */
    public int[][] getMatriz() {
        return matrizCoeficiencia;
    }

    /**
     * Establece un nuevo valor a la matriz de coeficiencia.
     *
     * @param matrizCoeficiencia nuevos valores para la matriz de coeficiencia.
     */
    public void setMatrizCoeficiencia(int[][] matrizCoeficiencia) {
        this.matrizCoeficiencia = matrizCoeficiencia;
    }

    /**
     * Obtiene la matriz de adyacencia
     *
     * @return matriz de adyacencia.
     */
    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    /**
     * Establece un nuevo valor a la matriz de adyacencia.
     *
     * @param matrizAdyacencia nuevos valores para la matriz de adyacencia.
     */
    public void setMatrizAdyacencia(int[][] matrizAdyacencia) {
        this.matrizAdyacencia = matrizAdyacencia;
    }

    /**
     * Metodo para obtener un valor de una posicion especifica dentro de la
     * matriz de coeficiencia.
     *
     * @param fila posicion de la fila de la matriz.
     * @param columna posicion de la columna de la matriz.
     * @return valor de la posicion dada.
     */
    public int obtenerDistancia(int fila, int columna) {
        return matrizCoeficiencia[fila][columna];
    }

    /**
     * Metodo para cambiar el valor de la distancia de una posicion dentro de la
     * matriz de coeficiencia.
     *
     * @param dato nuevo valor de la distancia.
     * @param fila posicion de la fila de la matriz.
     * @param columna posicion de la columna de la matriz.
     */
    public void cambiarDistancia(int dato, int fila, int columna) {
        if (matrizCoeficiencia[fila][columna] > 0) {
            matrizCoeficiencia[fila][columna] = dato;
            // Esta se encarga de cambiar de igual forma el dato espejo
            matrizCoeficiencia[columna][fila] = dato;
        } else {
            System.out.println("No existe conexcion de nodos en esta posicion");
        }
    }

    /**
     * Metodo para eliminar las conecciones de un nodo en la matriz de
     * adyacencia
     *
     * @param numNodo numero del nodo al que se eliminara la adyacencia.
     */
    public void eliminarNodo(int numNodo) {
        for (int i = 0; matrizAdyacencia.length > i; i++) {
            if (matrizAdyacencia[numNodo - 1][i] == 1) {
                // Elimina las filas 
                matrizAdyacencia[numNodo - 1][i] = 0;
                matrizCoeficiencia[numNodo - 1][i] = 0;

                // Elimina las columnas
                matrizAdyacencia[i][numNodo - 1] = 0;
                matrizCoeficiencia[i][numNodo - 1] = 0;
            }
        }
    }

    public void agregarNodo(int numNodo) {
        int nuevoTamaño = matrizAdyacencia.length + 1;
        int[][] nuevaMatrizAdyacencia = new int[nuevoTamaño][nuevoTamaño];
        int[][] nuevaMatrizCoeficiencia = new int[nuevoTamaño][nuevoTamaño];

        // Copiar los valores existentes a la nueva matriz
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.arraycopy(matrizAdyacencia[i], 0, nuevaMatrizAdyacencia[i],
                    0, matrizAdyacencia[i].length);
            System.arraycopy(matrizCoeficiencia[i], 0, nuevaMatrizCoeficiencia[i],
                    0, matrizCoeficiencia[i].length);
        }

        // Establecer las conexiones para el nuevo nodo con los nodos existentes (por ejemplo, aquí suponiendo que el nuevo nodo se conecta con todos los nodos existentes)
        for (int i = 0; i < nuevoTamaño - 1; i++) {
            nuevaMatrizAdyacencia[i][nuevoTamaño - 1] = 1; // Conexión del nuevo nodo con los nodos existentes
            nuevaMatrizAdyacencia[nuevoTamaño - 1][i] = 1; // Conexión de los nodos existentes con el nuevo nodo
            // Similar para la matriz de coeficiencia si es necesario
        }

        // Ahora puedes asignar las nuevas matrices a las originales si lo deseas
        matrizAdyacencia = nuevaMatrizAdyacencia;
        matrizCoeficiencia = nuevaMatrizCoeficiencia;
    }

    public int[] getSize() {
        int[] size = new int[2];
        size[0] = matrizAdyacencia.length;       // Número de filas
        size[1] = matrizAdyacencia[0].length;    // Número de columnas
        return size;
    }

}
