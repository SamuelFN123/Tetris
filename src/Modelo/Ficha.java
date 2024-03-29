/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author a22samuelfn
 */
public abstract class Ficha {

    protected ArrayList<Cadrado> cadrados = new ArrayList<>();

    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }

    public boolean moverDereita() {

        Iterator<Cadrado> lblCadrado = cadrados.iterator();
        while (lblCadrado.hasNext()) {
            Cadrado tmp = lblCadrado.next();
            tmp.setX(tmp.getX() + Xogo.LADO_CADRADO);
        }
        return true;
    }

    public boolean moverEsquerda() {

        Iterator<Cadrado> lblCadrado = cadrados.iterator();
        while (lblCadrado.hasNext()) {
            Cadrado tmp = lblCadrado.next();
            tmp.setX(tmp.getX() - Xogo.LADO_CADRADO);
        }
        return true;
    }

    public boolean moverAbaixo() {

        Iterator<Cadrado> lblCadrado = cadrados.iterator();
        while (lblCadrado.hasNext()) {
            Cadrado tmp = lblCadrado.next();
            tmp.setY(tmp.getY() + Xogo.LADO_CADRADO);
        }
        return true;
    }

    public abstract boolean rotar();

    public abstract int getPosicion();

}
