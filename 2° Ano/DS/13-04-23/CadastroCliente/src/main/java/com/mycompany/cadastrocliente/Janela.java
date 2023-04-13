/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocliente;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JLabel titulo, nome,cpf,rg,endereco,cidade,estado,cep;
    JTextField campoNome,campoCpf,campoRg,campoEndereco,campoCidade,campoEstado,campoCep;
    
    Janela(){
        setVisible(true);
        setLocationRelativeTo(null);
        Container tela = getContentPane();
        setLayout(null);
        setSize(500,500);
        
        titulo = new JLabel("Cadastro de Cliente");
        nome = new JLabel("Nome");
        cpf = new JLabel("CPF");
        rg = new JLabel("RG");
        endereco = new JLabel("Endereço");
        cidade = new JLabel("Cidade");
        estado = new JLabel("Estado");
        cep = new JLabel("CEP");
        campoNome = new JTextField(50);
        campoCpf = new JTextField(11);
        campoRg = new JTextField(9);
        campoEndereco = new JTextField(100);
        campoCidade = new JTextField(50);
        campoEstado = new JTextField(2);
        campoCep = new JTextField(8);
        
        tela.setBackground(new Color(216, 212, 196));
        
        titulo.setForeground(Color.red);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        nome.setFont(new Font("Arial" , Font.BOLD, 12));
        cpf.setFont(new Font("Arial" , Font.BOLD, 12));
        rg.setFont(new Font("Arial" , Font.BOLD, 12));
        endereco.setFont(new Font("Arial" , Font.BOLD, 12));
        cidade.setFont(new Font("Arial" , Font.BOLD, 12));
        estado.setFont(new Font("Arial" , Font.BOLD, 12));
        cep.setFont(new Font("Arial" , Font.BOLD, 12));
        
        
        titulo.setBounds(150, 10, 200, 20);
        nome.setBounds(10, 30,40,40);
        campoNome.setBounds(10, 60, 300,25);
        
        cpf.setBounds(10,80,40,40);
        campoCpf.setBounds(10, 110, 150, 25);
        
        rg.setBounds(10,140,40,40);
        campoRg.setBounds(10, 170, 120, 25);
        
        endereco.setBounds(10,200,90,40);
        campoEndereco.setBounds(10, 230, 300, 25);
        
        cidade.setBounds(10,260,90,40);
        campoCidade.setBounds(10, 290, 280, 25);
        
        estado.setBounds(10,320,70,40);
        campoEstado.setBounds(10, 350, 230, 25);
        
        cep.setBounds(10,380,40,40);
        campoCep.setBounds(10, 410, 120, 25);
        
        tela.add(titulo);
        tela.add(nome);
        tela.add(campoNome);
        tela.add(cpf);
        tela.add(campoCpf);
        tela.add(rg);
        tela.add(campoRg);
        tela.add(endereco);
        tela.add(campoEndereco);
        tela.add(cidade);
        tela.add(campoCidade);
        tela.add(estado);
        tela.add(campoEstado);
        tela.add(cep);
        tela.add(campoCep);
        
        
    }
}
