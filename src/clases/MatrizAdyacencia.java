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
public class MatrizAdyacencia {

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
    private int[][] matrizDefault = {
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

    /**
     * Constructor por omision.
     */
    public MatrizAdyacencia() {

    }

    /**
     * Obtiene la matriz default.
     *
     * @return matriz default.
     */
    public int[][] getMatriz() {
        return matrizDefault;
    }

    /**
     * Metodo para obtener un valor de una posicion especifica dentro de la
     * matriz.
     *
     * @param fila posicion de la fila de la matriz.
     * @param columna posicion de la columna de la matriz.
     * @return valor de la posicion dada.
     */
    public int obtenerDistancia(int fila, int columna) {
        return matrizDefault[fila][columna];
    }

    /**
     * Metodo para cambiar el valor de la distancia de una posicion dentro de la
     * matriz.
     *
     * @param dato nuevo valor de la distancia.
     * @param fila posicion de la fila de la matriz.
     * @param columna posicion de la columna de la matriz.
     */
    public void cambiarDistancia(int dato, int fila, int columna) {
        matrizDefault[fila][columna] = dato;
        // Esta se encarga de cambiar de igual forma el dato espejo
        matrizDefault[columna][fila] = dato;
    }

}
