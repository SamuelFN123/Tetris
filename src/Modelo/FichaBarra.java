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
        if (posicion0) {
            return 0;
        } else {
            return 1;
        }
    }

    private void posicionInicial() {
        this.cadrados.get(0).darPosicion(100, 100);
        this.cadrados.get(1).darPosicion(this.cadrados.get(0).getX(), this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);
        this.cadrados.get(2).darPosicion(this.cadrados.get(0).getX(), this.cadrados.get(0).getY() + 2 * Xogo.LADO_CADRADO);
        this.cadrados.get(3).darPosicion(this.cadrados.get(0).getX(), this.cadrados.get(0).getY() + 3 * Xogo.LADO_CADRADO);
    }

    public boolean rotar() {

        //  ↓↓ Si estamos en vertical rotamos de esta forma
        if (posicion0) {
            return rotar0();

        } else {
            return rotar1();
        }
    }

    private boolean rotar0() {

        //posicion cuadrado 0
        this.cadrados.get(0).darPosicion(this.cadrados.get(0).getX() - Xogo.LADO_CADRADO, this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);

        //posicion cuadrado 3 porque el segundo mantiene posición
        this.cadrados.get(2).darPosicion(this.cadrados.get(2).getX() + Xogo.LADO_CADRADO, this.cadrados.get(2).getY() - Xogo.LADO_CADRADO);

        //cuarto cuadrado
        this.cadrados.get(3).darPosicion(this.cadrados.get(3).getX() + 2 * Xogo.LADO_CADRADO, this.cadrados.get(3).getY() - 2 * Xogo.LADO_CADRADO);
        return true;
    }

    private boolean rotar1() {

        this.cadrados.get(0).darPosicion(this.cadrados.get(0).getX() + Xogo.LADO_CADRADO, this.cadrados.get(0).getY() - Xogo.LADO_CADRADO);

        this.cadrados.get(2).darPosicion(this.cadrados.get(2).getX() - Xogo.LADO_CADRADO, this.cadrados.get(2).getY() + Xogo.LADO_CADRADO);

        this.cadrados.get(3).darPosicion(this.cadrados.get(3).getX() - 2 * Xogo.LADO_CADRADO, this.cadrados.get(3).getY() + 2 * Xogo.LADO_CADRADO);
        return true;
    }

}
