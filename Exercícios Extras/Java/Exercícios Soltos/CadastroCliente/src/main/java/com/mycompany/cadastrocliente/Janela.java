/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocliente;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JLabel titulo, rotuloNome, rotuloCPF, rotuloRG, rotuloEndereco, rotuloBairro, rotuloCEP, rotuloCidade, rotuloEstado, rotuloLogin, rotuloSenha, rotuloTelefone, rotuloCelular, rotuloEmail;
    
    JTextField campoNome, campoCPF, campoRG, campoEndereco, campoBairro, campoCEP, campoCidade, campoEstado, campoLogin, campoTelefone, campoCelular, campoEmail;;
    
    JPasswordField campoSenha;
            
    Janela(){
        super("Cadastro de Clientes");
        Container tela = getContentPane();
        setLayout(null);
        setSize(500 , 500);
        
        
        
        titulo = new JLabel("Cadastro de Clientes");
        rotuloNome = new JLabel("Nome: ");
        rotuloCPF = new JLabel("CPF: ");
        rotuloRG = new JLabel("RG: ");
        rotuloEndereco = new JLabel("Endereço: ");
        rotuloBairro = new JLabel("Bairro: ");
        rotuloCEP = new JLabel("CEP: ");
        rotuloCidade = new JLabel("Cidade: ");
        rotuloEstado = new JLabel("Estado: ");
        rotuloLogin = new JLabel("Login: ");
        rotuloSenha = new JLabel("Senha: ");
        rotuloTelefone = new JLabel("Telefone: ");
        rotuloCelular = new JLabel("Celular: ");
        rotuloEmail = new JLabel("Email: ");
        
        campoNome = new JTextField(20);
        campoCPF = new JTextField(12);
        campoRG = new JTextField(12);
        campoEndereco = new JTextField(20);
        campoBairro = new JTextField(15);
        campoCEP = new JTextField(5);
        campoCidade = new JTextField(16); 
        campoEstado = new JTextField(4);
        campoLogin = new JTextField(14);
        campoSenha = new JPasswordField(14);
        campoTelefone = new JTextField(16);
        campoCelular = new JTextField(4);
        campoEmail = new JTextField(20);
        
        
        titulo.setFont(new Font("Arial" , Font.BOLD, 20));
        
        titulo.setBounds(130,5,200,50);
        rotuloNome.setBounds(10, 50, 50, 20);
        rotuloCPF.setBounds(10, 90, 50, 20);
        rotuloRG.setBounds(300, 90, 50, 20);
        rotuloEndereco.setBounds(10, 130, 80, 20);
        rotuloBairro.setBounds(10, 170, 50, 20);
        rotuloCEP.setBounds(320, 170, 50, 20);
        rotuloCidade.setBounds(10, 210, 50, 20);
        rotuloEstado.setBounds(380, 210, 50, 20);
        rotuloLogin.setBounds(10, 250, 50, 20);
        rotuloSenha.setBounds(10, 290, 50, 20);
        rotuloTelefone.setBounds(10, 330, 80, 20);
        rotuloCelular.setBounds(310, 330, 80, 20);
        rotuloEmail.setBounds(10, 370, 50, 20);
        
        campoNome.setBounds(50,50,400,20);
        campoCPF.setBounds(50, 90, 250, 20);
        campoEmail.setBounds(50, 370, 400, 20);
        
        setVisible(true);
        tela.add(titulo);
        tela.add(rotuloNome);
        tela.add(rotuloCPF);
        tela.add(rotuloRG);
        tela.add(rotuloEndereco);
        tela.add(rotuloBairro);
        tela.add(rotuloCEP);
        tela.add(rotuloCidade);
        tela.add(rotuloEstado);
        tela.add(rotuloLogin);
        tela.add(rotuloSenha);
        tela.add(rotuloTelefone);
        tela.add(rotuloCelular);
        tela.add(rotuloEmail);
        
        tela.add(campoNome);
        tela.add(campoCPF);
        tela.add(campoEmail);
    }
}
