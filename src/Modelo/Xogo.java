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

    public final static int LADO_CADRADO = 20;
    private int MAX_Y = 500;
    //Linea perder 100Y
    private int MAX_X = 180;
    private int numeroLinas;
    private boolean pausa = false;
    private ArrayList<Cadrado> cadradosChan = new ArrayList<>();
    private Ficha fichaActual;
    private VentanaPrincipal ventana;
    private ArrayList<Cadrado> cadradosborrar = new ArrayList<>();

    public Ficha getFichaActual() {
        return fichaActual;
    }

    public Xogo(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public boolean ePosicionValida(int x, int y) {

        if (!(dentroTablero(x, y))) {
            return false;
        }
        if (chocaFichaCoChan()) {
            return false;
        }

        Iterator<Cadrado> chan = cadradosChan.iterator();
        while (chan.hasNext()) {
            Cadrado tmp = chan.next();
            if (obterCoordenadaX(tmp) == x && obterCoordenadaY(tmp) == y) {

                return false;
            }
        }
        return true;
    }

    private boolean dentroTablero(int x, int y) {
        if (x >= MAX_X || x < 0) {
            return false;
        } else if (y >= MAX_Y || y < 0) {
            engadirFichaAoChan();
            return false;
        }
        return true;
    }

    public void engadirFichaAoChan() {

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            cadradosChan.add(fichaActual.getCadrados().get(i));
        }
        borrarLinasCompletas();
        xenerarNovaFicha();
    }

    public void xenerarNovaFicha() {

        int Ficha = (int) Math.floor(Math.random() * (4) + 1);
        switch (Ficha) {
            case 1 -> {
                fichaActual = new FichaCadrada();
            }
            case 2 -> {
                fichaActual = new FichaBarra();
            }
            case 3 -> {
                fichaActual = new FichaT();
            }
            case 4 -> {
                fichaActual = new FichaL();
            }
        }

    }

    public void rotarFicha() {
        if (comprobar()) {
            fichaActual.rotar();
        }
    }

    private boolean comprobar() {

        if (fichaActual instanceof FichaCadrada) {
            return true;

        } else {

            if (fichaActual instanceof FichaBarra) {

                if (fichaActual.getPosicion() == 0) {
                    return comprobarBarraPos1();

                } else {
                    return comprobarBarraPos0();
                }

            } else {
                return comprobarAlrededor();
            }
        }
    }

    private boolean comprobarAlrededor() {

        boolean continua = comprobarPosicion(fichaActual.getPosicion());
        return continua;
    }

    private boolean comprobarPosicion(int posicion) {

        int cordx = obterCoordenadaX(fichaActual.getCadrados().get(1));
        int cordy = obterCoordenadaY(fichaActual.getCadrados().get(1));
        switch (posicion) {
            case 0 -> {
                return comprobarPosicion0(cordx, cordy);
            }
            case 1 -> {
                return comprobarPosicion1(cordx, cordy);
            }
            case 2 -> {
                return comprobarPosicion2(cordx, cordy);
            }
            case 3 -> {
                return comprobarPosicion3(cordx, cordy);
            }
            default -> {
                return false;
            }
        }
    }

    private boolean comprobarPosicion3(int cordx, int cordy) {

        boolean continua;
        continua = ePosicionValida(cordx, cordy + LADO_CADRADO);
        if (continua && fichaActual instanceof FichaL) {

            continua = ePosicionValida(cordx, cordy - LADO_CADRADO);
            if (continua) {

                continua = ePosicionValida(cordx + LADO_CADRADO, cordy + LADO_CADRADO);
            }
            return continua;

        } else {
            return continua;
        }
    }

    private boolean comprobarPosicion2(int cordx, int cordy) {

        boolean continua;
        continua = ePosicionValida(cordx + LADO_CADRADO, cordy);
        if (continua && fichaActual instanceof FichaL) {

            continua = ePosicionValida(cordx - LADO_CADRADO, cordy);
            if (continua) {

                continua = ePosicionValida(cordx - LADO_CADRADO, cordy + LADO_CADRADO);
            }
            return continua;

        } else {
            return continua;
        }
    }

    private boolean comprobarPosicion1(int cordx, int cordy) {

        boolean continua;
        continua = ePosicionValida(cordx, cordy - LADO_CADRADO);
        if (continua && fichaActual instanceof FichaL) {

            continua = ePosicionValida(cordx - LADO_CADRADO, cordy - LADO_CADRADO);
            if (continua) {

                continua = ePosicionValida(cordx, cordy + LADO_CADRADO);
            }
            return continua;

        } else {
            return continua;
        }
    }

    private boolean comprobarPosicion0(int cordx, int cordy) {

        boolean continua;
        continua = ePosicionValida(cordx - LADO_CADRADO, cordy);
        if (continua && fichaActual instanceof FichaL) {

            continua = ePosicionValida(cordx + LADO_CADRADO, cordy);
            if (continua) {

                continua = ePosicionValida(cordx + LADO_CADRADO, cordy - LADO_CADRADO);
            }
            return continua;

        } else {
            return continua;
        }
    }

    private boolean comprobarBarraPos0() {

        boolean continua;
        int cordx = obterCoordenadaX(fichaActual.getCadrados().get(1));
        int cordy = obterCoordenadaY(fichaActual.getCadrados().get(1));
        //posiocion 0 cadrado 0
        continua = ePosicionValida(cordx, cordy - LADO_CADRADO);
        //posiocion 0 cadrado 2
        if (continua) {
            continua = ePosicionValida(cordx, cordy + LADO_CADRADO);
            //posiocion 0 cadrado 3
            if (continua) {
                continua = ePosicionValida(cordx, cordy + 2 * LADO_CADRADO);
            }
        }
        return continua;
    }

    private boolean comprobarBarraPos1() {

        boolean continua;
        int cordx = obterCoordenadaX(fichaActual.getCadrados().get(1));
        int cordy = obterCoordenadaY(fichaActual.getCadrados().get(1));
        //posiocion 1 cadrado 0
        continua = ePosicionValida(cordx - LADO_CADRADO, cordy);
        //posiocion 1 cadrado 2
        if (continua) {
            continua = ePosicionValida(cordx + LADO_CADRADO, cordy);
            //posiocion 1 cadrado 3
            if (continua) {
                continua = ePosicionValida(cordx + 2 * LADO_CADRADO, cordy);
            }
        }
        return continua;
    }

    public void moverFichaDereita() {
        int cordx;
        int cordy;
        boolean valido = true;

        for (int i = 0; i < 4 && valido; i++) {

            cordx = obterCoordenadaX(fichaActual.getCadrados().get(i)) + LADO_CADRADO;
            cordy = obterCoordenadaY(fichaActual.getCadrados().get(i));
            if (!(ePosicionValida(cordx, cordy))) {

                valido = false;
            }
        }
        if (valido) {
            fichaActual.moverDereita();
        }
    }

    public void moverFichaEsquerda() {
        int cordx;
        int cordy;
        boolean valido = true;

        for (int i = 0; i < 4 && valido; i++) {

            cordx = obterCoordenadaX(fichaActual.getCadrados().get(i)) - LADO_CADRADO;
            cordy = obterCoordenadaY(fichaActual.getCadrados().get(i));
            if (!(ePosicionValida(cordx, cordy))) {

                valido = false;
            }
        }
        if (valido) {
            fichaActual.moverEsquerda();
        }
    }

    public void moverFichaAbaixo() {
        int cordx;
        int cordy;
        boolean valido = true;

        for (int i = 0; i < 4 && valido; i++) {

            cordx = obterCoordenadaX(fichaActual.getCadrados().get(i));
            cordy = obterCoordenadaY(fichaActual.getCadrados().get(i)) + LADO_CADRADO;
            if (!(ePosicionValida(cordx, cordy))) {

                valido = false;
            }
        }
        if (valido) {
            fichaActual.moverAbaixo();
        }
    }

    public void borrarLinasCompletas() {

        int altura = MAX_Y;

        while (altura >= 0) {

            comprobarLina(altura);
            cadradosborrar.clear();
            altura -=LADO_CADRADO;
        }
    }

    private void comprobarLina(int altura) {
        
        int mismaY = 0;
        Iterator<Cadrado> chan1 = cadradosChan.iterator();
        boolean linaBorrada = false;
        while (chan1.hasNext() && !linaBorrada) {
            
            Cadrado tmp = chan1.next();
            if (obterCoordenadaY(tmp) == altura) {
                
                mismaY++;
                cadradosborrar.add(tmp);
                if (mismaY == MAX_X / LADO_CADRADO) {
                    linaBorrada=true;
                    borrarLina();
                }
            }
        }
    }

    public void borrarLina() {
        
        Iterator<Cadrado> borrar = cadradosborrar.iterator();
        while(borrar.hasNext()){
            ventana.borrarCadrado(borrar.next().getlBlCadrado());
        }
        
        cadradosChan.removeAll(cadradosborrar);
        cadradosborrar.clear();
    }

    public boolean chocaFichaCoChan() {
        //Comproba se choca co borde do panel
        for (int i = 0; i < 4; i++) {
            if (fichaActual.getCadrados().get(i).getY() == MAX_Y) {
                engadirFichaAoChan();
                return true;
            }
        }
        //Comprobamos se choca cos cadrados do chan
        Iterator<Cadrado> chan = cadradosChan.iterator();
        while (chan.hasNext()) {//recorremos os cadrados no solo
            Cadrado tmp = chan.next();
            for (int i = 0; i < 4; i++) {// recorremos os cadrados da ficha
                if (obterCoordenadaY(fichaActual.getCadrados().get(i)) == obterCoordenadaY(tmp) - LADO_CADRADO && obterCoordenadaX(fichaActual.getCadrados().get(i)) == obterCoordenadaX(tmp)) {
                    //  ↑↑  Comprobamos se y da cadrado da ficha actual é igual o y do cadrado que comprobamos
                    //  ↓↓  se coincide añadimos os cadrados da ficha ao chan
                    engadirFichaAoChan();
                    return true;
                }

            }

        }
        return false;
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
        coordy = cadradoDaFicha.getCoordenadas().substring(indexComa + 1);
        int cordy = Integer.parseInt(coordy);
        return cordy;
    }
}
