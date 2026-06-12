/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficsimulation;

/**
 *
 * @author Bushra Khan <your.name at your.org>
 */

import javax.swing.JFrame;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Traffic Simulation System");
        setSize(800, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        add(new SimulationPanel());

        setVisible(true);
    }

    public static void main(String[] args) {

        new MainFrame();
    }
}
