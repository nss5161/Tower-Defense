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
    
    public MainFrame(Player player){
        super("Tower Defense Game");
        setLayout(null);
        add(controlPanel);
        controlPanel.setBounds(0, 50, FRAME_HEIGHT, FRAME_WIDTH);
        
        add(gameTitle);
        gameTitle.setBounds(0, -275, FRAME_HEIGHT, FRAME_WIDTH);
        gameTitle.setFont(gameTitle.getFont().deriveFont(28.0f));
        
        controlPanel.add(difficultyPanel);
        controlPanel.add(namePanel);
        controlPanel.add(highScorePanel);
        controlPanel.add(instructionPanel);
        
        //difficultyPanel.setBackground(Color.BLUE);
        //difficulty.setForeground(Color.CYAN);
        difficulty.setBounds(30, -36, 100, 100);
        difficultyPanel.setLayout(null);
        easyButton.setBounds(30, 80, 100, 100);
        mediumButton.setBounds(30, 205, 100, 100);
        hardButton.setBounds(30, 330, 100, 100);
        difficultyPanel.add(difficulty);
        difficultyPanel.add(easyButton);
        difficultyPanel.add(mediumButton);
        difficultyPanel.add(hardButton);
        
        namePanel.add(enterName);
        namePanel.add(nameBox);
        
        highScorePanel.add(highScore);
        
        instructionPanel.add(instructions);
        
        easyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                try {
                    if (!(player.getName().equals(null)) && !(player.getName().equals(""))) {
                        GameFrame gf = new GameFrame(player);
                        gf.setVisible(true);
                        setVisible(false);
                    } else {
                        JFrame errorFrame = new JFrame(); 
                        JLabel error = new JLabel("Please enter a name");
                        errorFrame.add(error);
                        errorFrame.setSize(200, 100);
                        errorFrame.setLocationRelativeTo(null); 
                        errorFrame.setVisible(true);
                        errorFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    }
                } catch (NullPointerException npe) {
                    JFrame errorFrame = new JFrame(); 
                    JLabel error = new JLabel("Please enter a name");
                    errorFrame.add(error);
                    errorFrame.setSize(200, 100);
                    errorFrame.setLocationRelativeTo(null); 
                    errorFrame.setVisible(true);
                    errorFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
                        JFrame errorFrame = new JFrame(); 
                        JLabel error = new JLabel("Please enter a name");
                        errorFrame.add(error);
                        errorFrame.setSize(200, 100);
                        errorFrame.setLocationRelativeTo(null); 
                        errorFrame.setVisible(true);
                        errorFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    }
                } catch (NullPointerException npe) {
                    JFrame errorFrame = new JFrame(); 
                    JLabel error = new JLabel("Please enter a name");
                    errorFrame.add(error);
                    errorFrame.setSize(200, 100);
                    errorFrame.setLocationRelativeTo(null); 
                    errorFrame.setVisible(true);
                    errorFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
                        JFrame errorFrame = new JFrame(); 
                        JLabel error = new JLabel("Please enter a name");
                        errorFrame.add(error);
                        errorFrame.setSize(200, 100);
                        errorFrame.setLocationRelativeTo(null); 
                        errorFrame.setVisible(true);
                        errorFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    }
                } catch (NullPointerException npe) {
                    JFrame errorFrame = new JFrame(); 
                    JLabel error = new JLabel("Please enter a name");
                    errorFrame.add(error);
                    errorFrame.setSize(200, 100);
                    errorFrame.setLocationRelativeTo(null); 
                    errorFrame.setVisible(true);
                    errorFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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