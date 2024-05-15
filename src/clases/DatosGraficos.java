/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author sebastian
 */
public class DatosGraficos {

    MatrizAdyacencia m = new MatrizAdyacencia();

    private int matriz[][] = m.getMatriz();
    private int coordenadaX[] = new int[15];
    private int coordenadaY[] = new int[15];
    private String nombre[] = new String[15];
    private int enArbol[];

    public DatosGraficos() {

    }

    public int getmAdyacencia(int i, int j) {
        return matriz[i][j];
    }

    public int getCordeX(int i) {
        return coordenadaX[i];
    }

    public int getCordeY(int i) {
        return coordenadaY[i];
    }

    public String getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbol(int i) {
        return enArbol[i];
    }

    public void setmAdyacencia(int i, int j, int mAdyacencia) {
        this.matriz[i][j] = mAdyacencia;
    }

    public void setCordeX(int i, int cordeX) {
        this.coordenadaX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.coordenadaY[i] = cordeY;
    }

    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbol(int i, int enArbol) {
        this.enArbol[i] = enArbol;
    }

    public void crearEnArbol(int i) {
        enArbol = new int[i];
    }

}
