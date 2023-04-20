/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttoncomicone;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
        JButton botao1,botao2,botao3,botao4;
        
        Janela(){
            super("Exemplo com JButton");
            Container tela = getContentPane();
            setLayout(null);
            setSize(400, 250);
            setVisible(true);
            
            botao1 = new JButton("Procurar");
            botao2 = new JButton("Voltar >>");
            botao3 = new JButton("Próximo >>");
            botao4 = new JButton("Abrir");
            
            botao1.setBounds(50, 20, 100, 20);
            botao2.setBounds(50, 60, 100, 20);
            botao3.setBounds(50, 100, 100, 20);
            botao4.setBounds(50, 140, 100, 20);
            
            botao1.setBackground(Color.yellow);
            botao2.setBackground(Color.red);
            botao3.setBackground(Color.blue);
            botao4.setBackground(Color.white);
            
            botao1.setForeground(Color.blue);
            botao2.setForeground(Color.green);
            botao3.setForeground(Color.red);
            botao4.setForeground(Color.black);
            
            botao1.setMnemonic(KeyEvent.VK_P);
            botao2.setMnemonic(KeyEvent.VK_V);
            botao3.setMnemonic(KeyEvent.VK_X);
            botao4.setMnemonic(KeyEvent.VK_S);
            
            tela.add(botao1);
            tela.add(botao2);
            tela.add(botao3);
            tela.add(botao4);
            
            
            
        }
}
