/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22samuelfn
 */
public abstract class Ficha {
    
    protected ArrayList<Cadrado> cadrados = new ArrayList<>();

    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }
    
    public boolean moverDereita(){
        Iterator<Cadrado> iter = this.cadrados.iterator();
        while(iter.hasNext()){
            Cadrado tmp = iter.next();
            tmp.setX(tmp.getX()+50);
        }
        return true;
    }
    
    public boolean moverEsquerda(){
        Iterator<Cadrado> iter = this.cadrados.iterator();
        while(iter.hasNext()){
            Cadrado tmp = iter.next();
            tmp.setX(tmp.getX()-50);
        }
        return true;
    }

    public boolean moverAbaixo(){
        Iterator<Cadrado> iter = this.cadrados.iterator();
        while(iter.hasNext()){
            Cadrado tmp = iter.next();
            tmp.setY(tmp.getY()+50);
        }
        return true;
    }
    
    public abstract boolean rotar();

}
