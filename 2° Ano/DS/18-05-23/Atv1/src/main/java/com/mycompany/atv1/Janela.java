/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv1;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JLabel lado1, lado2, lado3, resultado;
    JTextField campoLado1, campoLado2, campoLado3;
    JButton verificar;
    
            
    Janela(){
        super("Triângulos");
        Container tela = getContentPane();
        setLayout(null);
        setSize(500 , 250);
        
        lado1 = new JLabel("Lado 1: ");
        lado2 = new JLabel("Lado 2: ");
        lado3 = new JLabel("Lado 3: ");
        
        campoLado1 = new JTextField(20);
        campoLado2 = new JTextField(20);
        campoLado3 = new JTextField(20);
        resultado = new JLabel();
        
        verificar = new JButton("Verificar");
        
        lado1.setBounds(10, 50, 50, 20);
        lado2.setBounds(10, 90, 50, 20);
        lado3.setBounds(10, 130, 50, 20);
        
        campoLado1.setBounds(70,50,220,20);
        campoLado2.setBounds(70, 90, 220, 20);
        campoLado3.setBounds(70, 130, 220, 20);
        
        resultado.setBounds(300, 90, 220, 20);
        verificar.setBounds(70, 160, 120, 20);
        
        resultado.setVisible(false);
        
        verificar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ex){
                        verificarTriangulo();
                    }
            }
        );
        
        setVisible(true);
        tela.add(lado1);
        tela.add(lado2);
        tela.add(lado3);
        tela.add(campoLado1);
        tela.add(campoLado2);
        tela.add(campoLado3);
        tela.add(resultado);
        tela.add(verificar);
        
    }
    
    public void verificarTriangulo(){
        int lado1Num = Integer.parseInt(campoLado1.getText());
        int lado2Num = Integer.parseInt(campoLado2.getText());
        int lado3Num = Integer.parseInt(campoLado3.getText());
        
        if(lado1Num == lado2Num && lado1Num == lado3Num){
            resultado.setVisible(true);
            resultado.setText("Triângulo Equilátero");
        }else if(lado1Num != lado2Num && lado1Num != lado3Num && lado2Num != lado3Num){
            resultado.setVisible(true);
            resultado.setText("Triângulo Escaleno");
        }else if(lado1Num == lado2Num && lado1Num != lado3Num || lado2Num == lado3Num && lado2Num != lado1Num || lado3Num == lado1Num && lado3Num != lado2Num){
            resultado.setVisible(true);
            resultado.setText("Triângulo Isósceles");
        }
    }
}