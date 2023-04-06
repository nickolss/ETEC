/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex02;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    Janela(){
        setVisible(true);
        setSize(400,200);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        Container tela = getContentPane();
        tela.setBackground(new Color(125,125,125));
        
        ImageIcon icone = new ImageIcon("icone.png");
        setIconImage(icone.getImage());
    }
}
