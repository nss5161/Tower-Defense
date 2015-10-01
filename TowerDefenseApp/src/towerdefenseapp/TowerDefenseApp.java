/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TowerDefenseApp {
    public static void main(String[] args) {
        Player player = new Player();
        MainFrame frame = new MainFrame(player);
        frame.setVisible(true);

    }
    
}
