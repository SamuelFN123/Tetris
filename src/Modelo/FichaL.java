/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author a22samuelfn
 */
public class FichaL extends Ficha{
    
    int posicion;
    
    public FichaL(){
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
        this.cadrados.get(0).darPosicion(100, 100);
        this.cadrados.get(1).darPosicion(100, 120);
        this.cadrados.get(2).darPosicion(100, 140);
        this.cadrados.get(3).darPosicion(120, 140);
    }
    
    public boolean rotar(){
        return true;
    }
}
