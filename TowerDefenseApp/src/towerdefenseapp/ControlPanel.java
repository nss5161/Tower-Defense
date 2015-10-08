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
    
    private final static int FRAME_WIDTH = 600;
    private final static int FRAME_HEIGHT = 800;
    
    private JButton smallWeapon = new JButton();
    private JButton mediumWeapon = new JButton();
    private JButton largeWeapon = new JButton(); 
    
    private JButton start = new JButton("Start");
    
    public ControlPanel() {
        setBackground(Color.LIGHT_GRAY);
        setBounds(600, 0, 200, FRAME_HEIGHT);
        
        smallWeapon.setBounds(50, 120, 100, 100);
        mediumWeapon.setBounds(50, 240, 100, 100);
        largeWeapon.setBounds(50, 360, 100, 100);
        start.setBounds(50, 575, 100, 100); 
        
        add(smallWeapon);
        add(mediumWeapon);
        add(largeWeapon);
        add(start);
    }
    
}
