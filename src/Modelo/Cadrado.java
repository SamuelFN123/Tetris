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
    private JLabel lblCadrado = new JLabel();

    public Cadrado(Color corRecheo) {
        this.corRecheo = corRecheo;
        this.lblCadrado.setBackground(corRecheo);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        this.lblCadrado.setBounds(x, y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        this.lblCadrado.setBounds(x, y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    }

    public String getCoordenadas() {
        return this.x +","+ this.y;
    }

    public void darPosicion(int x, int y) {
        this.x = x;
        this.y = y;
        this.lblCadrado.setBounds(x, y, Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
    }

    public JLabel getCadrado() {
        return lblCadrado;
    }

}
