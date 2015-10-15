/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*; 

/**
 *
 * @author dlt5206
 */
public class EnemyPanel extends JPanel implements ActionListener {
    
    private JButton start = new JButton("Start");
    private Timer t1; 
    private Enemy en1 = new Enemy();
    
    public EnemyPanel() {
        start.setBounds(50, 575, 100, 100); 
        start.addActionListener(this); 
        setLayout(null);
        t1 = new Timer(10, this);
        add(start);
        setBounds(0, 0, 800, 800);
    }
    
    /*public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        en1.setLocation((int)en1.getX(), (int)en1.getY() + 1);
        g.fillRect((int)en1.getX(), (int)en1.getY(), 20, 20);
    }*/
    
    public void actionPerformed(ActionEvent evt) {
        Object obj = evt.getSource();
        if (obj == start) {
            t1.start();
        } 
        if (obj == t1) {
            repaint(); 
        }
    }
    
}
