/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelasimples;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    Janela(){
        super("Exemplo com Labem");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        
        rotulo1.setFont(new Font("Arial", Font.BOLD, 14));
        rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        rotulo3.setFont(new Font("Courier New", Font.BOLD, 18));
        rotulo4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
