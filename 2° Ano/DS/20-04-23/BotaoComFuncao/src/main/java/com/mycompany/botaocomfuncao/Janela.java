/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botaocomfuncao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JButton botaoSair;
    Janela(){
        super("Exemplo botão com função");
        Container tela = getContentPane();
        setLayout(null);
        setSize(300, 150);
        setVisible(true);
        setLocationRelativeTo(null);
        
        botaoSair = new JButton("Sair");
        botaoSair.setBounds(100,50,100,20);
        botaoSair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        
                        e.getWhen();
                    }
                }
        );
        
        tela.add(botaoSair);
        
    }
}
