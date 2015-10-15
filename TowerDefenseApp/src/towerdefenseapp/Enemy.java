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
public class Enemy extends Rectangle {
    
    private int health;
    private double speed;
    private int value;
    
    public Enemy() {
        super(150, -10, 10, 10);
        health = 1;
        speed = 1;
        value = 1;
        //g.setColor(Color.BLACK);
        //g.fillRect((int)xPos, (int)yPos, 10, 10);
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
    
}
