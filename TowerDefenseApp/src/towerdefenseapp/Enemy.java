/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

/**
 *
 * @author dlt5206
 */
public class Enemy {
    
    private int health;
    private double speed;
    private int value;
    
    public Enemy() {
        health = 1;
        speed = 1;
        value = 1;
    }
    
    public Enemy(int initHealth, double initSpeed, int initValue) {
        health = initHealth;
        speed =  initSpeed;
        value = initValue;
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
