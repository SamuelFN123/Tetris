/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author a22samuelfn
 */
public class FichaCadrada extends Ficha{
    
    public FichaCadrada(){
        for (int i = 0; i < 4; i++) {
            this.cadrados.add(new Cadrado(java.awt.Color.blue));
        }
        posicionInicial();
    }

    public int getPosicion() {
        return -1;
    }
    
    private void posicionInicial(){
        this.cadrados.get(0).darPosicion(100, 100);
        this.cadrados.get(1).darPosicion(120, 100);
        this.cadrados.get(2).darPosicion(100, 80);
        this.cadrados.get(3).darPosicion(120, 80);
    }
    
    public boolean rotar(){
        return true;
    }
}
