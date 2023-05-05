/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocliente;
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
    JLabel titulo, rotuloNome, rotuloCPF, rotuloRG, rotuloEndereco, rotuloBairro, rotuloCEP, rotuloCidade, rotuloEstado, rotuloLogin, rotuloSenha, rotuloTelefone, rotuloCelular, rotuloEmail;
    JFormattedTextField campoCPF, campoRG, campoCEP, campoEstado, campoTelefone, campoCelular;
    JTextField campoNome,campoEndereco, campoBairro, campoCidade, campoLogin, campoEmail;
    JPasswordField campoSenha;
    MaskFormatter mascaraCPF, mascaraRG, mascaraCEP, mascaraEstado, mascaraTelefone, mascaraCelular;
            
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
        campoEndereco = new JTextField(20);
        campoBairro = new JTextField(15);
        campoCidade = new JTextField(16); 
        campoLogin = new JTextField(14);
        campoSenha = new JPasswordField(14);
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
        rotuloEstado.setBounds(360, 210, 50, 20);
        rotuloLogin.setBounds(10, 250, 50, 20);
        rotuloSenha.setBounds(10, 290, 50, 20);
        rotuloTelefone.setBounds(10, 330, 80, 20);
        rotuloCelular.setBounds(310, 330, 80, 20);
        rotuloEmail.setBounds(10, 370, 50, 20);
        
        
        try{
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraRG = new MaskFormatter("##.###.###-A");
            mascaraCEP = new MaskFormatter("#####-###");
            mascaraEstado = new MaskFormatter("??");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            mascaraCelular = new MaskFormatter("(##)#####-####");
            
            mascaraCPF.setPlaceholder("_");
            mascaraRG.setPlaceholder("_");
            mascaraCEP.setPlaceholder("_");
            mascaraEstado.setPlaceholder("_");
            mascaraTelefone.setPlaceholder("_");
            mascaraCelular.setPlaceholder("_");
        }catch(ParseException e){
            
        }
        
        campoCPF = new JFormattedTextField(mascaraCPF);
        campoRG = new JFormattedTextField(mascaraRG);
        campoCEP = new JFormattedTextField(mascaraCEP);
        campoEstado = new JFormattedTextField(mascaraEstado);
        campoTelefone = new JFormattedTextField(mascaraTelefone);
        campoCelular = new JFormattedTextField(mascaraCelular);
        
        campoNome.setBounds(70,50,380,20);
        campoCPF.setBounds(70, 90, 220, 20);
        campoRG.setBounds(325, 90, 125, 20);
        campoEndereco.setBounds(70, 130, 380, 20);
        campoBairro.setBounds(70, 170, 240, 20);
        campoCEP.setBounds(360, 170, 90, 20);
        campoCidade.setBounds(70, 210, 280, 20);
        campoEstado.setBounds(405, 210, 45, 20);
        campoLogin.setBounds(70, 250, 220, 20);
        campoSenha.setBounds(70, 290, 220, 20);
        campoTelefone.setBounds(70, 330, 235, 20);
        campoCelular.setBounds(370, 330, 80, 20);
        campoEmail.setBounds(70, 370, 380, 20);
        
        
        
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
        tela.add(campoRG);
        tela.add(campoEndereco);
        tela.add(campoBairro);
        tela.add(campoCEP);
        tela.add(campoCidade);
        tela.add(campoEstado);
        tela.add(campoLogin);
        tela.add(campoSenha);
        tela.add(campoTelefone);
        tela.add(campoCelular);
        tela.add(campoEmail);
    }
}
