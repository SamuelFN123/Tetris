/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import UI.VentanaPrincipal;

/**
 *
 * @author a22samuelfn
 */
public class Xogo {

    private final int LADO_CADRADO = 20;
    private int MAX_Y;
    private int MAX_X;
    private int numeroLinas;
    private boolean pausa;
    private ArrayList<Cadrado> cadradoschan = new ArrayList<>();
    private Ficha fichaActual;
    private VentanaPrincipal ventanaPrincipal;

    public void ePosicionValida(int x, int y) {
        Iterator<Cadrado> iter = cadradoschan.iterator();
        while (iter.hasNext()) {
            Cadrado temp = iter.next();
            if (temp.getCoordenadas().contentEquals("X: " + x + " Y: " + y)) {
                engadirFichaAoChan();
            }
        }
    }

    public void engadirFichaAoChan() {

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            cadradoschan.add(fichaActual.getCadrados().get(i));
        }

    }

    public void xenerarNovaFicha() {
        fichaActual = new FichaCadrada();
        for (int i = 0; i < 4; i++) {
            ventanaPrincipal.pintarCadrado(fichaActual.getCadrados().get(i).getCadrado());
        }
    }

}
