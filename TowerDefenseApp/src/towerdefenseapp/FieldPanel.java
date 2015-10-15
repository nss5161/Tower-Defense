/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dlt5206
 */
public class FieldPanel extends JPanel {
    
    
    private Enemy en1 = new Enemy();
    
    
    public FieldPanel() {

        setLayout(null);
        setBackground(Color.BLACK);
        setBounds(0, 0, 600, 800);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        
        for(int i = 0; i <= 600; i = i + 100) {
            for(int j = 0; j <= 800; j = j + 100) {
                g.fillRect(i, j, 100, 100);
            }
        }

        g.setColor(Color.WHITE);
        g.fillRect(100, 0, 100, 100);
        g.fillRect(100, 100, 100, 100);
        g.fillRect(100, 200, 100, 100);
        g.fillRect(100, 300, 100, 100);
        g.fillRect(200, 300, 100, 100);
        g.fillRect(300, 300, 100, 100);
        g.fillRect(400, 300, 100, 100); 
        g.fillRect(400, 400, 100, 100);
        g.fillRect(400, 500, 100, 100);
        g.fillRect(400, 600, 100, 100);
        g.fillRect(400, 700, 100, 100);
        g.fillRect(400, 800, 100, 100);
        

        g.setColor(Color.BLACK);
        en1.setLocation((int)en1.getX(), (int)en1.getY() + 1);
        g.fillRect((int)en1.getX(), (int)en1.getY(), 20, 20);
    }
    
}
