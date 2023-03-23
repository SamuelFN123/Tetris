/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import javax.swing.BorderFactory;
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
        this.lblCadrado.setSize(Xogo.LADO_CADRADO, Xogo.LADO_CADRADO);
        this.lblCadrado.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        this.lblCadrado.setBackground(corRecheo);
    }

    public Color getCorRecheo() {
        return corRecheo;
    }

    public void setCorRecheo(Color corRecheo) {
        this.corRecheo = corRecheo;
    }

    public JLabel getLblCadrado() {
        return lblCadrado;
    }

    public void setLblCadrado(JLabel lblCadrado) {
        this.lblCadrado = lblCadrado;
    }

    public int getX() {
        this.X = lblCadrado.getX();
        return X;
    }

    public void setX(int x) {
        this.X = x;
        this.lblCadrado.setLocation(X, Y);
    }

    public int getY() {
        this.Y = lblCadrado.getY();
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
        this.lblCadrado.setLocation(X, Y);
    }

    public String getCoordenadas() {
        return this.X + "," + this.Y;
    }

    public void darPosicion(int x, int y) {
        this.X = x;
        this.Y = y;
        this.lblCadrado.setLocation(X, Y);
    }

    public JLabel getlBlCadrado() {
        return lblCadrado;
    }

}
