/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author a22samuelfn
 */
public abstract class Ficha {
    
    protected HashMap<Integer,Cadrado> cadrados = new HashMap<>();

    public HashMap<Integer, Cadrado> getCadrados() {
        return cadrados;
    }

    
    
    public boolean moverDereita(){
        
        for (int i = 0; i < this.cadrados.size(); i++) {
            this.cadrados.get(i).setX(this.cadrados.get(i).getX()+50);
        }
        return true;
    }
    
    public boolean moverEsquerda(){
        for (int i = 0; i < this.cadrados.size(); i++) {
            this.cadrados.get(i).setX(this.cadrados.get(i).getX()-50);
        }
        return true;
    }

    public boolean moverAbaixo(){
        for (int i = 0; i < this.cadrados.size(); i++) {
            this.cadrados.get(i).setY(this.cadrados.get(i).getY()+50);
        }
        return true;
    }
    
    public abstract boolean rotar();

}
