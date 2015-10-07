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
    
    private JPanel fieldPanel = new FieldPanel();
    private JPanel controlPanel = new ControlPanel();
    
    private final static int FRAME_HEIGHT = 800;
    private final static int FRAME_WIDTH = 800;
    
    private JLabel name = new JLabel();
    private JLabel health = new JLabel();
    private JLabel score = new JLabel();
    
    private JButton smallWeapon = new JButton();
    private JButton mediumWeapon = new JButton();
    private JButton largeWeapon = new JButton(); 
    
    private JButton start = new JButton("Start");
    
    public GameFrame(Player player) {
        setLayout(null);
        controlPanel.setLayout(null);
        
        name.setText("Name: " + player.getName());
        health.setText("Health: " + Integer.toString(player.getHealth())); 
        score.setText("Score: " + Integer.toString(player.getScore()));
        
        name.setBounds(0, 10, 100, 20);
        health.setBounds(0, 30, 100, 20);
        score.setBounds(0, 50, 100, 20);

        controlPanel.add(name); 
        controlPanel.add(health); 
        controlPanel.add(score);
        
        add(fieldPanel);
        add(controlPanel);
        
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
    }
}
