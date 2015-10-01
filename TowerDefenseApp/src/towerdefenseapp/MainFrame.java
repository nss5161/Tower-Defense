/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.event.*;

public class MainFrame extends JFrame {
    private JLabel gameTitle = new JLabel("Tower Defense");
    private JLabel difficulty = new JLabel("Select Difficulty");
    private JLabel enterName = new JLabel("Enter Name");
    private JLabel highScore = new JLabel("High Scores");
    private JLabel instructions = new JLabel("Instructions");
    
    private JButton easyButton = new JButton("Easy");
    private JButton mediumButton = new JButton("Medium");
    private JButton hardButton = new JButton("Hard");
    
    private JTextField nameBox = new JTextField(10);
    
    private final static int FRAME_HEIGHT = 800;
    private final static int FRAME_WIDTH = 800;
    
    private JPanel controlPanel = new JPanel(new GridLayout(1, 4));
    private JPanel difficultyPanel = new JPanel();
    private JPanel namePanel = new JPanel();
    private JPanel highScorePanel = new JPanel();
    private JPanel instructionPanel = new JPanel();
    private JPanel titlePanel = new JPanel();
    
    public MainFrame(Player player){
        super("Tower Defense Game");
        setLayout(null);
        add(titlePanel);
        titlePanel.setBounds(0, 0, 800, 50);
        add(controlPanel);
        controlPanel.setBounds(0, 50, FRAME_WIDTH, FRAME_HEIGHT);
        
        
        titlePanel.add(gameTitle);
        titlePanel.setBackground(Color.BLACK);
        
        gameTitle.setBounds(0, 50, FRAME_WIDTH, FRAME_HEIGHT);
        gameTitle.setFont(gameTitle.getFont().deriveFont(28.0f)); 
        gameTitle.setForeground(Color.WHITE);
        
        controlPanel.add(difficultyPanel);
        controlPanel.add(namePanel);
        controlPanel.add(highScorePanel);
        controlPanel.add(instructionPanel);
        
        difficultyPanel.setBackground(Color.BLACK);
        difficulty.setForeground(Color.WHITE);
        difficulty.setBounds(30, -36, 100, 100);
        difficultyPanel.setLayout(null);
        easyButton.setBounds(30, 80, 100, 100);
        mediumButton.setBounds(30, 205, 100, 100);
        hardButton.setBounds(30, 330, 100, 100);
        difficultyPanel.add(difficulty);
        difficultyPanel.add(easyButton);
        difficultyPanel.add(mediumButton);
        difficultyPanel.add(hardButton);
        
        namePanel.setBackground(Color.BLACK);
        enterName.setForeground(Color.WHITE);
        namePanel.add(enterName);
        namePanel.add(nameBox);
        
        highScorePanel.setBackground(Color.BLACK);
        highScore.setForeground(Color.WHITE);
        highScorePanel.add(highScore);
        
        instructionPanel.setBackground(Color.BLACK);
        instructions.setForeground(Color.WHITE);
        instructionPanel.add(instructions);
        
        easyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                try {
                    if (!(player.getName().equals(null)) && !(player.getName().equals(""))) {
                        GameFrame gf = new GameFrame(player);
                        gf.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a name"); 
                    }
                } catch (NullPointerException npe) {
                    JOptionPane.showMessageDialog(null, "Please enter a name"); 
                }
            }
        });
        
        mediumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                try {
                    if (!(player.getName().equals(null)) && !(player.getName().equals(""))) {
                        GameFrame gf = new GameFrame(player);
                        gf.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a name"); 
                    }
                } catch (NullPointerException npe) {
                        JOptionPane.showMessageDialog(null, "Please enter a name"); 
                }
            }
        });
        
        hardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                try {
                    if (!(player.getName().equals(null)) && !(player.getName().equals(""))) {
                        GameFrame gf = new GameFrame(player);
                        gf.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a name"); 
                    }
                } catch (NullPointerException npe) {
                        JOptionPane.showMessageDialog(null, "Please enter a name"); 
                }
            }
        });
        
        
        nameBox.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent evt) {
                String playerName = nameBox.getText(); 
                player.setName(playerName);
                System.out.println(player.getName()); 
            }
            public void removeUpdate(DocumentEvent evt) {
                String playerName = nameBox.getText(); 
                player.setName(playerName);
                System.out.println(player.getName()); 
            }
            public void insertUpdate(DocumentEvent evt) {
                String playerName = nameBox.getText(); 
                player.setName(playerName);
                System.out.println(player.getName()); 
            }
        });

        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
    }

}