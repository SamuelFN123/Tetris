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

    public boolean ePosicionValida(int x, int y) {

        if (!(dentroTablero(x, y))) {
            return false;
        }

        Iterator<Cadrado> iter = cadradoschan.iterator();
        while (iter.hasNext()) {
            Cadrado tmp = iter.next();
            if (obterCoordenadaX(tmp) == x && obterCoordenadaY(tmp) == y) {
                return false;
            }
        }
        return true;
    }

    private boolean dentroTablero(int x, int y) {
        if (x > MAX_X) {
            return false;
        } else if (y > MAX_Y) {
            return false;
        }
        return true;
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

    public void moverFichaDereita() {
        int cordx;
        int cordy;
        boolean valido = true;
        for (int i = 0; i < 4; i++) {
            cordx = obterCoordenadaX(fichaActual.getCadrados().get(i)) + LADO_CADRADO;
            cordy = obterCoordenadaY(fichaActual.getCadrados().get(i));
            if(!(ePosicionValida(cordx, cordy))){
                valido=false;
            }
        }
        if(valido){
            fichaActual.moverDereita();
        }
    }
    
    public void moverFichaEsquerda() {
        int cordx;
        int cordy;
        boolean valido = true;
        for (int i = 0; i < 4; i++) {
            cordx = obterCoordenadaX(fichaActual.getCadrados().get(i)) - LADO_CADRADO;
            cordy = obterCoordenadaY(fichaActual.getCadrados().get(i));
            if(!(ePosicionValida(cordx, cordy))){
                valido=false;
            }
        }
        if(valido){
            fichaActual.moverEsquerda();
        }
    }
    
    public void moverFichaAbaixo() {
        int cordx;
        int cordy;
        boolean valido = true;
        for (int i = 0; i < 4; i++) {
            cordx = obterCoordenadaX(fichaActual.getCadrados().get(i));
            cordy = obterCoordenadaY(fichaActual.getCadrados().get(i))+ LADO_CADRADO;
            if(!(ePosicionValida(cordx, cordy))){
                valido=false;
            }
        }
        if(valido){
            fichaActual.moverAbaixo();
        }
    }
    private int obterCoordenadaX(Cadrado cadradoDaFicha) {
        String coordx;
        int indexComa = cadradoDaFicha.getCoordenadas().indexOf(",");
        coordx = cadradoDaFicha.getCoordenadas().substring(0, indexComa);
        int cordx = Integer.parseInt(coordx);
        return cordx;
    }

    private int obterCoordenadaY(Cadrado cadradoDaFicha) {
        String coordy;
        int indexComa = cadradoDaFicha.getCoordenadas().indexOf(",");
        coordy = cadradoDaFicha.getCoordenadas().substring(indexComa);
        int cordy = Integer.parseInt(coordy);
        return cordy;
    }
}
