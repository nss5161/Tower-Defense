/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dlt5206
 */
public class FieldPanel extends JPanel {
    
    
    public FieldPanel() {
        setLayout(null);
        setBackground(Color.BLACK);
        setBounds(0, 0, 550, 800);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        
    }
}
