/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dlt5206
 */
public class Enemy extends JPanel {
    
    private int health;
    private double speed;
    private int value;
    private int xPos;
    private int yPos;
    
    public Enemy(Graphics g) {
        health = 1;
        speed = 1;
        value = 1;
        xPos = 150;
        yPos = -10;
        g.setColor(Color.BLACK);
        g.fillRect(xPos, yPos, 10, 10);
    }
    
    public int getHealth() {
        return health;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public int getValue() {
        return value; 
    }
    
    public void move(Graphics g, int x, int y) {
        xPos = xPos + x;
        yPos = yPos + y;
        g.setColor(Color.BLACK);
        g.fillRect(xPos + x, yPos + y, 10, 10);

    }
    
    public int getX() {
        return xPos;
    }
    
    public int getY() {
        return yPos;
    }
}
