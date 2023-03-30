/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirajanela;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class PrimeiraJanela extends JFrame{
    PrimeiraJanela(){
        /* super("Nossa primeira janela");
        setSize(1000, 500);
        //setLocationRelativeTo(null);
        setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);
        //setExtendedState(ICONIFIED);
        setResizable(false);
        
        Container tela = getContentPane();
        //tela.setBackground(Color.blue);
        tela.setBackground(new Color(102, 100, 120));
        */
        
        //Definir imagem
        super("GIF em janela");
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        ImageIcon icone = new ImageIcon("localdoarquivo");
        setIconImage(icone.getImage());
        Container tela = getContentPane();
        
       
    }
}
