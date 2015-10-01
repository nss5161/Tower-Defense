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
public class Player {
    
    private int health;
    private int score;
    private int money; 
    private String name;
    //private Weapon[] ownedWeapons;
    private String selectedDifficulty; 
    
    public Player() {
        health = 100;
        score = 0;
        money = 0;
    }
    
    public void setHealth(int num) {
        health = health - num;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setScore(int num) {
        score = score + num;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setMoney(int num) {
        money = money + num;
    }
    
    public int getMoney() {
        return money;
    }
    
    public void setName(String initName) {
        name = initName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setDifficulty(String difficulty) {
        selectedDifficulty = difficulty;
    }
    
    public String getDifficulty() {
        return selectedDifficulty;
    }
    
    public void buyWeapon() {
        
    }
}
