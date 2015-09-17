/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    private JLabel gameTitle = new JLabel("Tower Defense");
    private JLabel difficulty = new JLabel("Select Difficulty");
    private JLabel enterName = new JLabel("Enter Name");
    private JLabel highScore = new JLabel("High Scores");
    private JLabel instructions = new JLabel("Instructions");
    
    private JButton easyButton = new JButton("Easy");
    private JButton mediumButton = new JButton("Medium");
    private JButton hardButton = new JButton("Hard");
    
    Dimension d = new Dimension(15, 5);
    
    private JTextField nameBox = new JTextField(15);
    
    private final static int FRAME_HEIGHT = 500;
    private final static int FRAME_WIDTH = 500;
    
    private JPanel controlPanel = new JPanel(new GridLayout(1, 4));
    private JPanel difficultyPanel = new JPanel();
    private JPanel namePanel = new JPanel();
    private JPanel highScorePanel = new JPanel();
    private JPanel instructionPanel = new JPanel();
    
    public MainFrame(){
        super("Tower Defense Game");
        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.CENTER);
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(gameTitle, BorderLayout.NORTH);
        gameTitle.setFont(gameTitle.getFont().deriveFont(28.0f));

        controlPanel.add(difficultyPanel);
        controlPanel.add(namePanel);
        controlPanel.add(highScorePanel);
        controlPanel.add(instructionPanel);
        
        difficultyPanel.add(easyButton);
        difficultyPanel.add(mediumButton);
        difficultyPanel.add(hardButton);
        easyButton.setSize(d);
        mediumButton.setSize(d);
        hardButton.setSize(d);
        
        namePanel.add(enterName);
        namePanel.add(nameBox);
        
        highScorePanel.add(highScore);
        
        instructionPanel.add(instructions);
        
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

}