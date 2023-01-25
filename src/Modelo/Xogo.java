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
    ArrayList<Cadrado> cadradoschan = new ArrayList<>();
    Iterator<Cadrado> iter;
    Ficha xogada;
    
    public void ePosicionValida(int x, int y){
        iter = cadradoschan.iterator();
        while(iter.hasNext()){
            Cadrado temp = iter.next();
            if(temp.getCoordenadas().contentEquals("X: "+x+" Y: "+y)){
                
            }
        }
    }
    
    public void engadirFichaAoChan(){
        
        Iterator<Cadrado> cadradosPeza = xogada.getCadrados().iterator();
        while(cadradosPeza.hasNext()){
            cadradoschan.add(cadradosPeza.next());
        }
    }
    
}
