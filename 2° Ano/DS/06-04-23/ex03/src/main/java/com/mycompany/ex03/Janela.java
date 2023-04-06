/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex03;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JLabel nome, endereco, cidade, estado, cep, telefone, titulo;
    Janela(){
        setSize(250,250);
        setLocationRelativeTo(null);
        Container tela = getContentPane();
        tela.setBackground(Color.cyan);
        setResizable(false);
        
        ImageIcon image = new ImageIcon("icone.png");
        setIconImage(image.getImage());
        
        setVisible(true);
        setSize(250,250);
        setLayout(null);
        
        titulo = new JLabel("Cadastro de Clientes");
        nome = new JLabel("Nome: ");
        endereco = new JLabel("Endereço: ");
        cidade = new JLabel("Cidade: ");
        estado = new JLabel("Estado: ");
        cep = new JLabel("CEP: ");
        telefone = new JLabel("Telefone: ");
        
        titulo.setBounds(20,0,200,20);
        nome.setBounds(20,20,80,20);
        endereco.setBounds(20,50,80,20);
        cidade.setBounds(20,80,80,20);
        estado.setBounds(20,110,80,20);
        cep.setBounds(20,140,80,20);
        telefone.setBounds(20,170, 80,20);
        
        titulo.setForeground(Color.blue);
        
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        nome.setFont(new Font("Arial", Font.BOLD, 14));
        endereco.setFont(new Font("Arial", Font.BOLD, 14));
        cidade.setFont(new Font("Arial", Font.BOLD, 14));
        estado.setFont(new Font("Arial", Font.BOLD, 14));
        cep.setFont(new Font("Arial", Font.BOLD, 14));
        telefone.setFont(new Font("Arial", Font.BOLD, 14));
        
        
        tela.add(titulo);
        tela.add(nome);
        tela.add(endereco);
        tela.add(cidade);
        tela.add(estado);
        tela.add(cep);
        tela.add(telefone);
    }
}
