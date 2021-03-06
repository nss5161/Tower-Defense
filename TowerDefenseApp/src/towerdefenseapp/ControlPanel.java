/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*; 

/**
 *
 * @author dlt5206
 */
public class ControlPanel extends JPanel implements ActionListener {
    
    private final static int FRAME_HEIGHT = 800;
    
    private Timer t1; 
    private JButton start = new JButton("Start");
    
    private JButton smallWeapon = new JButton();
    private JButton mediumWeapon = new JButton();
    private JButton largeWeapon = new JButton(); 
    
    
    private Enemy en1 = new Enemy();
    
    public ControlPanel() {
        setBackground(Color.LIGHT_GRAY);
        setBounds(600, 0, 200, FRAME_HEIGHT);
        
        t1 = new Timer(10, this);
        
        start.setBounds(50, 575, 100, 100); 
        start.addActionListener(this); 
        
        smallWeapon.setBounds(50, 120, 100, 100);
        mediumWeapon.setBounds(50, 240, 100, 100);
        largeWeapon.setBounds(50, 360, 100, 100);
        
        add(start);
        add(smallWeapon);
        add(mediumWeapon);
        add(largeWeapon);
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
