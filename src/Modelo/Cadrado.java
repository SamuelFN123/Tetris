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
    
    private int X;
    private int Y;
    private Color corRecheo;
    private JLabel lblCadrado = new JLabel();
    
    public Cadrado(Color corRecheo) {
        this.corRecheo = corRecheo;
        this.lblCadrado.setBackground(corRecheo);
    }
    
    public int getX() {
        return X;
    }
    
    public void setX(int x) {
        this.X = x;
        this.lblCadrado.setBounds(X, Y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    }
    
    public int getY() {
        return Y;
    }
    
    public void setY(int y) {
        this.Y = y;
        this.lblCadrado.setBounds(X, Y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    }
    
    public String getCoordenadas() {
        return this.X + "," + this.Y;
    }
    
    public void darPosicion(int x, int y) {
        this.X = x;
        this.Y = y;
        this.lblCadrado.setBounds(X, Y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    }
    
    public JLabel getCadrado() {
        return lblCadrado;
    }
    
}
