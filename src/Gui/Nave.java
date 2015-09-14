/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.image.BufferedImage;

/**
 *
 * @author Brenda
 */
public class Nave {

    private int x;
    private int y;
    private BufferedImage image;
    private String planeta;

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public Nave(int x, int y, BufferedImage image) {
        this.x = x;
        this.y = y;
        this.image = image;
        planeta = "MERCURIO";
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

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

}
