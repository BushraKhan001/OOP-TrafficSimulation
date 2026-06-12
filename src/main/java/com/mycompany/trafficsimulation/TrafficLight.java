/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficsimulation;

/**
 *
 * @author Bushra Khan <your.name at your.org>
 */



import java.awt.Color;
import java.awt.Graphics;

public class TrafficLight {

    private boolean green = true;

    public void changeLight() {
        green = !green;
    }

    public boolean isGreen() {
        return green;
    }

    public void draw(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(350, 70, 40, 120);

        if (green) {

            g.setColor(Color.GRAY);
            g.fillOval(355, 80, 30, 30);

            g.setColor(Color.GREEN);
            g.fillOval(355, 130, 30, 30);

        } else {

            g.setColor(Color.RED);
            g.fillOval(355, 80, 30, 30);

            g.setColor(Color.GRAY);
            g.fillOval(355, 130, 30, 30);
        }
    }
}
