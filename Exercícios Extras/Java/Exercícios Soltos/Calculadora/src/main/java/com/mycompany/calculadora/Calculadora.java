/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author nicks
 */
public class Calculadora extends JFrame{
    JLabel n1, n2, exibir;
    JTextField num1, num2;
    JButton somar, subtrair, multiplicar, dividir;
    
    Calculadora(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        setVisible(true);
        
        
        
        n1 = new JLabel("1º Número: ");
        n2 = new JLabel("2º Número: ");
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        dividir = new JButton("Dividir");
        multiplicar = new JButton("Multiplicar");
        
        
        exibir.setVisible(false);
        
        
        n1.setBounds(50,20,100,20);
        n2.setBounds(50,60,100,20);
        num1.setBounds(120,20,200,20);
        num2.setBounds(120,60,200,20);
        exibir.setBounds(50,150,200,20);
        somar.setBounds(10,100,80,20);
        subtrair.setBounds(100,100,80,20);
        dividir.setBounds(190,100,80,20);
        multiplicar.setBounds(280,100,100,20);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        somar();
                    }
                }
        );
        
        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        subtrair();
                    }
                }
        );
        
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        dividir();
                    }
                }
        );
        
        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        multiplicar();
                    }
                }
        );
        
        tela.add(n1);
        tela.add(n2);
        tela.add(num1);
        tela.add(num2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);
        
        setSize(400,250);setVisible(true);
    }
    
    public void somar(){
        int soma,n1,n2;
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        soma = n1+n2;
        
        exibir.setVisible(true);
        exibir.setText("A soma é " + soma);
    }
    
    public void subtrair(){
        int soma,n1,n2;
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        soma = n1-n2;
        
        exibir.setVisible(true);
        exibir.setText("A subtração é " + soma);
    }
    
    public void dividir(){
        double soma,n1,n2;
        n1 = Double.parseDouble(num1.getText());
        n2 = Double.parseDouble(num2.getText());
        soma = n1/n2;
        
        exibir.setVisible(true);
        exibir.setText("A divisão é " + soma);
    }
    
    public void multiplicar(){
        double soma,n1,n2;
        n1 = Double.parseDouble(num1.getText());
        n2 = Double.parseDouble(num2.getText());
        soma = n1*n2;
        
        exibir.setVisible(true);
        exibir.setText("A multiplicação é " + soma);
    }
}
