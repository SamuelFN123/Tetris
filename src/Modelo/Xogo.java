/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Iterator;
import UI.VentanaPrincipal;
/**
 *
 * @author a22samuelfn
 */
public class Xogo {
    
    private int LADO_CADRADO;
    private int MAX_Y;
    private int MAX_X;
    private int numeroLinas;
    private boolean pausa;
    private ArrayList<Cadrado> cadradoschan = new ArrayList<>();
    private Ficha xogada;
    private VentanaPrincipal ventana;
    
    public void ePosicionValida(int x, int y){
        Iterator<Cadrado> iter = cadradoschan.iterator();
        while(iter.hasNext()){
            Cadrado temp = iter.next();
            if(temp.getCoordenadas().contentEquals("X: "+x+" Y: "+y)){
                engadirFichaAoChan();
            }
        }
    }
    
    public void engadirFichaAoChan(){
        
        for (int i = 0; i < xogada.getCadrados().size(); i++) {
            cadradoschan.add(xogada.getCadrados().get(i));
        }
        
    }
    
}
