/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.awt.Color;
import javax.swing.JLabel;
/**
 *
 * @author a22samuelfn
 */
public class Cadrado {
    
    int x;
    int y;
    Color corRecheo;
    JLabel Cadrado = new JLabel();
    
    public String getCoordenadas(){
        return "X: "+this.x+" Y: "+this.y;
    }
}
