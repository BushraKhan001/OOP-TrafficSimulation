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

public class Car extends Vehicle {

    private Color color;

    public Car(int x, int y, int speed, Color color) {
        super(x, y, speed);
        this.color = color;
    }

    public void draw(Graphics g) {

        g.setColor(color);
        g.fillRect(x, y, 60, 25);

        g.setColor(Color.BLACK);
        g.fillOval(x + 5, y + 20, 10, 10);
        g.fillOval(x + 45, y + 20, 10, 10);
    }
}
