/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Color;
import static ui.Vista.mapPanel;
import static ui.Vista.PintarFiguras;

/**
 *
 * @author sebastian
 */
public class AlgoritmoDijkstra {

    private final DatosGraficos arboles;
    private int subTope;
    private Nodo Nodoauxiliar = null;
    private int auxiliarAumulado; // es un acumulado auxiliar
    private int subtotalAcomulado;
    private final Nodo nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;

    public AlgoritmoDijkstra(DatosGraficos arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Nodo[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }

    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creacion del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Nodo();
        }
        mapPanel.paint(mapPanel.getGraphics());
        PintarFiguras(tope, arboles);
        PintarDibujos.seleccionNodo(mapPanel.getGraphics(),
                arboles.getCordeX(Origen),
                arboles.getCordeY(Origen), null, Color.GREEN); // pinta de color el nodo de Origen

        nodo[Origen].setVisitado(true);
        nodo[Origen].setNombre(Origen);

        do {
            subtotalAcomulado = 0;
            auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
            nodo[Origen].setEtiqueta(true);
            for (int j = 0; j < tope; j++) {
                if (arboles.getmAdyacencia(j, Origen) == 1) {
                    subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);

                    if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                        nodo[j].setAcumulado(subtotalAcomulado);
                        nodo[j].setVisitado(true);
                        nodo[j].setNombre(j);
                        nodo[j].setPredecesor(nodo[Origen]);
                    } else if (nodo[j].isVisitado() == false) {
                        nodo[j].setAcumulado(subtotalAcomulado);
                        nodo[j].setVisitado(true);
                        nodo[j].setNombre(j);
                        nodo[j].setPredecesor(nodo[Origen]);
                    }
                }
            }

            //Encontrando Camino mas corto
            for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                    if (nodo[i].getAcumulado() <= auxiliarAumulado) {
                        Origen = nodo[i].getNombre();
                        auxiliarAumulado = nodo[i].getAcumulado();
                    }
                }
            }
            subTope++;
        } while (subTope < tope + 1);

        Nodoauxiliar = nodo[nodoFinal];

        //Pintando caminos recorridos
        while (Nodoauxiliar.getPredecesor() != null) {
            PintarDibujos.pinta_Camino(mapPanel.getGraphics(),
                    arboles.getCordeX(Nodoauxiliar.getNombre()),
                    arboles.getCordeY(Nodoauxiliar.getNombre()),
                    arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()),
                    arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);

            PintarDibujos.seleccionNodo(mapPanel.getGraphics(),
                    arboles.getCordeX(Nodoauxiliar.getNombre()),
                    arboles.getCordeY(Nodoauxiliar.getNombre()), null, Color.BLUE);
            Nodoauxiliar = Nodoauxiliar.getPredecesor();
        }//fin de while Recorriendo caminos

        PintarDibujos.seleccionNodo(mapPanel.getGraphics(),
                arboles.getCordeX(nodoFinal),
                arboles.getCordeY(nodoFinal), null, Color.RED);//Pintando Nodo del destino

    }

}
