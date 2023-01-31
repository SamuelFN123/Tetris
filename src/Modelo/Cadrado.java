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
    
    private int x;
    private int y;
    private Color corRecheo;
    private JLabel Cadrado = new JLabel();
    
    public String getCoordenadas(){
        return "X: "+this.x+" Y: "+this.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getCorRecheo() {
        return corRecheo;
    }

    public void setCorRecheo(Color corRecheo) {
        this.corRecheo = corRecheo;
    }

    public JLabel getCadrado() {
        return Cadrado;
    }

    public void setCadrado(JLabel Cadrado) {
        this.Cadrado = Cadrado;
    }

    public Cadrado(int x, int y, Color corRecheo) {
        this.x = x;
        this.y = y;
        this.corRecheo = corRecheo;
    }
    
    
}
