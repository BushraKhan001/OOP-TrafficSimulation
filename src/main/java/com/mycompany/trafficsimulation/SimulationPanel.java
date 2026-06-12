/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficsimulation;

/**
 *
 * @author Bushra Khan <your.name at your.org>
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimulationPanel extends JPanel implements ActionListener {

    private Car car1;
    private Car car2;
    private TrafficLight light;
    private Timer timer;

    public SimulationPanel() {

        car1 = new Car(0, 250, 5, Color.BLUE);
        car2 = new Car(-150, 250, 4, Color.RED);

        light = new TrafficLight();

        timer = new Timer(100, this);
        timer.start();

        new Timer(5000, e -> {
            light.changeLight();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 240, 800, 70);

        g.setColor(Color.WHITE);

        for (int i = 0; i < 800; i += 40) {
            g.fillRect(i, 272, 20, 3);
        }

        car1.draw(g);
        car2.draw(g);

        light.draw(g);

        g.setColor(Color.BLACK);
        g.drawString("Traffic Simulation System", 20, 30);

        if (light.isGreen()) {
            g.drawString("Signal: GREEN", 20, 50);
        } else {
            g.drawString("Signal: RED", 20, 50);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (light.isGreen()) {

            car1.move();
            car2.move();

        } else {

            if (car1.getX() < 280) {
                car1.move();
            }

            if (car2.getX() < 220) {
                car2.move();
            }
        }

        if (car1.getX() > 850) {
            car1.setX(-100);
        }

        if (car2.getX() > 850) {
            car2.setX(-250);
        }

        repaint();
    }
}