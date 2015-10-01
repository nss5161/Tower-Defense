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
public class Weapon {
    
    private int hit;
    private int cost;
    private double range;
    
    public Weapon(int initHit, int initCost, int initRange) {
        hit = initHit;
        cost = initCost;
        range = initRange;
    }
    
    public int getHit() {
        return hit;
    }
    
    public int getCost() {
        return cost;
    }
    
    public double getRange() {
        return range;
    }
}
