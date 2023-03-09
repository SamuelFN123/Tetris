/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author a22samuelfn
 */
public class FichaT extends Ficha{
    
    int posicion;
    
    public FichaT(){
        for (int i = 0; i < 4; i++) {
            this.cadrados.add(new Cadrado(java.awt.Color.red));
        }
        posicionInicial();
        posicion=0;
    }
    
    public int getPosicion() {
        return posicion;
    }
    
    private void posicionInicial(){
        this.cadrados.get(0).darPosicion(140, 0);
        this.cadrados.get(1).darPosicion(this.cadrados.get(0).getX(), this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);
        this.cadrados.get(2).darPosicion(this.cadrados.get(0).getX(), this.cadrados.get(0).getY()+2*Xogo.LADO_CADRADO);
        this.cadrados.get(3).darPosicion(this.cadrados.get(0).getX()+Xogo.LADO_CADRADO, this.cadrados.get(0).getY()+Xogo.LADO_CADRADO);
    }
    
    public boolean rotar(){
        switch (posicion) {
            case 0 -> {
                posicion=1;
                return rotar0();
            }
            case 1 -> {
                posicion=2;
                return rotar1();
            }
            case 2 -> {
                posicion=3;
                return rotar2();
            }
            case 3 -> {
                posicion=0;
                return rotar3();
            }
            default -> {
                return false;
            }
        }

    }

    private boolean rotar0() {

        this.cadrados.get(0).darPosicion(this.cadrados.get(0).getX() - Xogo.LADO_CADRADO, this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);

        this.cadrados.get(2).darPosicion(this.cadrados.get(2).getX() + Xogo.LADO_CADRADO, this.cadrados.get(2).getY() - Xogo.LADO_CADRADO);

        this.cadrados.get(3).darPosicion(this.cadrados.get(3).getX() - Xogo.LADO_CADRADO, this.cadrados.get(3).getY() + Xogo.LADO_CADRADO);

        return true;
    }
    
    private boolean rotar1() {

        this.cadrados.get(0).darPosicion(this.cadrados.get(0).getX() + Xogo.LADO_CADRADO, this.cadrados.get(0).getY() - Xogo.LADO_CADRADO);

        this.cadrados.get(2).darPosicion(this.cadrados.get(2).getX() - Xogo.LADO_CADRADO, this.cadrados.get(2).getY() + Xogo.LADO_CADRADO);

        this.cadrados.get(3).darPosicion(this.cadrados.get(3).getX() - Xogo.LADO_CADRADO, this.cadrados.get(3).getY()- Xogo.LADO_CADRADO);

        return true;
    }
    
    private boolean rotar2() {

        this.cadrados.get(0).darPosicion(this.cadrados.get(0).getX() - Xogo.LADO_CADRADO, this.cadrados.get(0).getY() + Xogo.LADO_CADRADO);

        this.cadrados.get(2).darPosicion(this.cadrados.get(2).getX() + Xogo.LADO_CADRADO, this.cadrados.get(2).getY() - Xogo.LADO_CADRADO);

        this.cadrados.get(3).darPosicion(this.cadrados.get(3).getX() + Xogo.LADO_CADRADO, this.cadrados.get(3).getY() - Xogo.LADO_CADRADO);

        return true;
    }
    
    private boolean rotar3() {

        this.cadrados.get(0).darPosicion(this.cadrados.get(0).getX() + Xogo.LADO_CADRADO, this.cadrados.get(0).getY() - Xogo.LADO_CADRADO);

        this.cadrados.get(2).darPosicion(this.cadrados.get(2).getX() - Xogo.LADO_CADRADO, this.cadrados.get(2).getY() + Xogo.LADO_CADRADO);

        this.cadrados.get(3).darPosicion(this.cadrados.get(3).getX() + Xogo.LADO_CADRADO, this.cadrados.get(3).getY() + Xogo.LADO_CADRADO);

        return true;
    }
}
