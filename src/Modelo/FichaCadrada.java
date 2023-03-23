/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author a22samuelfn
 */
public class FichaCadrada extends Ficha {

    public FichaCadrada() {
        for (int i = 0; i < 4; i++) {
            this.cadrados.add(new Cadrado(java.awt.Color.blue));
        }
        posicionInicial();
    }

    public int getPosicion() {
        return -1;
    }

    private void posicionInicial() {
        this.cadrados.get(0).darPosicion(80, 0);
        this.cadrados.get(1).darPosicion(this.cadrados.get(0).getX() + Xogo.LADO_CADRADO, this.cadrados.get(0).getY());
        this.cadrados.get(2).darPosicion(this.cadrados.get(0).getX(), this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);
        this.cadrados.get(3).darPosicion(this.cadrados.get(0).getX() + Xogo.LADO_CADRADO, this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);
    }

    public boolean rotar() {
        return true;
    }
}
