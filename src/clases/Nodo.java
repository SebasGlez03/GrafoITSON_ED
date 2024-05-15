/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author sebastian
 */
public class Nodo {

    private int nombre;
    private boolean visitado;
    private boolean etiqueta;
    private int acumulado; // lleva el acoulado de cada nodo
    private Nodo Predecesor;

    public Nodo() {
        this.nombre = -1;
        this.visitado = false;
        this.etiqueta = false;
        this.Predecesor = null;
        this.acumulado = 0;

    }

    public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public Nodo getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulado(int acomulado) {
        this.acumulado = acomulado;
    }

    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }

}
