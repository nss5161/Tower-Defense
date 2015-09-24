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
    
   // private Player player = new Player(); 
    private JLabel name = new JLabel("Name: ");
    private JButton start = new JButton("Start");
    
    public ControlPanel() {
        add(start);
        setBackground(Color.BLUE);
        setBounds(350, 0, 150, 500);
        //+ player.getName()
        name.setFont(name.getFont().deriveFont(28.0f));
        add(name); 
    }
    
}
