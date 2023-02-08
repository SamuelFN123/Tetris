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

    public Cadrado(Color corRecheo) {
        this.corRecheo = corRecheo;
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

    public String getCoordenadas() {
        return "X: " + this.x + " Y: " + this.y;
    }

    public void darPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public JLabel getCadrado() {
        return Cadrado;
    }

}
