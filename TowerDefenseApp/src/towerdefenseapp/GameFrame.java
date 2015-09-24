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
public class GameFrame extends JFrame {
    
    private JPanel fieldPanel = new JPanel();
    private JPanel controlPanel = new JPanel();
    
    private final static int FRAME_HEIGHT = 800;
    private final static int FRAME_WIDTH = 800;
    
    private JLabel name = new JLabel();
    private JLabel health = new JLabel();
    private JLabel score = new JLabel();
    
    
    
    public GameFrame(Player player) {
        setLayout(null);
        
        fieldPanel.setBackground(Color.DARK_GRAY);
        fieldPanel.setBounds(0, 0, 550, 800);
        
        name.setText("Name: " + player.getName());
        health.setText("Health: " + Integer.toString(player.getHealth())); 
        score.setText("Score: " + Integer.toString(player.getScore()));
        
        controlPanel.setBackground(Color.LIGHT_GRAY);
        controlPanel.setBounds(550, 0, 250, 800);
        controlPanel.add(name); 
        controlPanel.add(health); 
        controlPanel.add(score); 
        
        add(fieldPanel);
        add(controlPanel);
        
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
