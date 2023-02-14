/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author a22samuelfn
 */
public class FichaBarra extends Ficha {

    boolean posicion0;

    public FichaBarra() {
        for (int i = 0; i < 4; i++) {
            this.cadrados.add(new Cadrado(java.awt.Color.yellow));
        }
        posicion0 = true;
        posicionInicial();
    }

    public int getPosicion() {
        return -1;
    }
    private void posicionInicial() {
        this.cadrados.get(0).darPosicion(100, 100);
        this.cadrados.get(1).darPosicion(100, 120);
        this.cadrados.get(2).darPosicion(100, 140);
        this.cadrados.get(3).darPosicion(100, 160);
    }

    public boolean rotar() {

        //  ↓↓ Si estamos en vertical rotamos de esta forma
        if (posicion0) {
            return rotar1();

        } else {
            return rotar2();
        }
    }

    private boolean rotar1() {

        int cordx;
        int cordy;
        boolean continua = true;

        //posicion que ocuparía primer cadrado 
        cordx = this.cadrados.get(0).getX() - 20;
        cordy = this.cadrados.get(0).getY() + 20;

        //si puede rotar rotamos si no flag para no seguir con los otros cuadrados
        continua = intentarRotar(cordx, cordy);

        //no continuamos si antes no pudimos rotar
        if (continua) {

            //posicion tercer cuadrado porque el segundo mantiene posición
            cordx = this.cadrados.get(2).getX() + 20;
            cordy = this.cadrados.get(2).getY() - 20;

            //otra vez comprobamos, si no podemos rotar, no seguimos
            continua = intentarRotar(cordx, cordy);

            //cuarto cuadrado
            if (continua) {
                cordx = this.cadrados.get(3).getX() + 40;
                cordy = this.cadrados.get(3).getY() - 40;

                continua = intentarRotar(cordx, cordy);

            }
        }
        return continua;
    }

    private boolean rotar2() {

        int cordx;
        int cordy;
        boolean continua = true;

        cordx = this.cadrados.get(0).getX() + 20;
        cordy = this.cadrados.get(0).getY() - 20;

        continua = intentarRotar(cordx, cordy);

        if (continua) {

            cordx = this.cadrados.get(2).getX() - 20;
            cordy = this.cadrados.get(2).getY() + 20;

            continua = intentarRotar(cordx, cordy);

            if (continua) {
                cordx = this.cadrados.get(3).getX() - 40;
                cordy = this.cadrados.get(3).getY() + 40;

                continua = intentarRotar(cordx, cordy);

            }
        }
        return continua;
    }

    private boolean intentarRotar(int x, int y) {
        if (podoRotar(x, y)) {
            this.cadrados.get(0).darPosicion(x, y);
            return true;
        } else {
            return false;
        }
    }

    private boolean podoRotar(int x, int y) {

        return true;
    }
}
