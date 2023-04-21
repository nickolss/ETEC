/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.versenha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author nicks
 */
public class Janela extends JFrame{
    JPasswordField caixa;
    JLabel rotulo,exibir;
    JButton mostrar;
    
    Janela(){
        super("Exemplo com JPasswordField");
        Container tela = getContentPane();
        setLayout(null);
        setSize(400, 250);
        setVisible(true);
        
        rotulo = new JLabel("Senha: ");
        caixa = new JPasswordField(10);
        exibir = new JLabel("A senha digitada é ");
        mostrar = new JButton("Mostrar");
        
        exibir.setVisible(false);
        
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,100,20);
        exibir.setBounds(50,100,100,20);
        mostrar.setBounds(150,100,80,20);
        
        mostrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String senha = new String(caixa.getPassword());
                        exibir.setVisible(true);
                        exibir.setText(senha);
                    }
                }
        );
        
        tela.add(rotulo);
        tela.add(caixa);
        tela.add(exibir);
        tela.add(mostrar);
    }
}
