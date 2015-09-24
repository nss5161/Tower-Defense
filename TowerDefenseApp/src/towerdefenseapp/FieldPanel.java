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
    
    //private JPanel gamePanel = new JPanel(); 
    //private JPanel playerPanel = new JPanel(); 
    
    public FieldPanel() {
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        //playerPanel.setBackground(Color.BLUE);
        
        setBounds(0, 0, 350, 500);
        //playerPanel.setBounds(350, 0, 150, 500);
        //add(gamePanel);
        //add(playerPanel); 
    }
}
