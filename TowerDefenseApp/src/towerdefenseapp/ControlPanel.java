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
public class ControlPanel extends JPanel {
    
    private final static int FRAME_WIDTH = 800;
    private final static int FRAME_HEIGHT = 800;
    
    private JButton smallWeapon = new JButton();
    private JButton mediumWeapon = new JButton();
    private JButton largeWeapon = new JButton(); 
    
    private JButton start = new JButton("Start");
    
    public ControlPanel() {
        setBackground(Color.LIGHT_GRAY);
        setBounds(550, 0, 250, FRAME_HEIGHT);
        
        smallWeapon.setBounds(68, 120, 100, 100);
        mediumWeapon.setBounds(68, 240, 100, 100);
        largeWeapon.setBounds(68, 360, 100, 100);
        start.setBounds(68, 575, 100, 100); 
        
        add(smallWeapon);
        add(mediumWeapon);
        add(largeWeapon);
        add(start);
    }
    
}
