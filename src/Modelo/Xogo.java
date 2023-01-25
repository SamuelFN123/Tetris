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
public class Xogo {
    
    int LADO_CADRADO;
    int MAX_Y;
    int MAX_X;
    int numeroLinas;
    boolean pausa;
    ArrayList<Cadrado> pezas = new ArrayList<>();
    Iterator<Cadrado> iter;
    
    private void ePosicionValida(int x, int y){
        iter = pezas.iterator();
        while(iter.hasNext()){
            Cadrado temp = iter.next();
            if(temp.getCoordenadas().contains())
        }
    }
    
}
