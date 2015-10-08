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
public class FieldPanel extends JPanel implements ActionListener {
    
    Timer t = new Timer(5, this);
    
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
    }
    
    public void actionPerformed(ActionEvent e) {
        t.start();
        repaint();
    }
    
    public void actionPerformed(ActionEvent e, Graphics g) {
        
        Enemy enemy1 = new Enemy(g);
        t.start();
        repaint();
        
        for (int i = 0; enemy1.getY() <= 350; i++) {
            enemy1.move(g, 0, 1);
        }
        for (int i = 150; enemy1.getX() <= 450; i++) {
            enemy1.move(g, 1, 0);
        }
        
        for (int i = 350; enemy1.getY() <= 800; i++) {
            enemy1.move(g, 0, 1);
        }
    }
}
