/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pequenocadastrocommascara;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.event.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    JLabel rotuloCep, rotuloTel, rotuloCPF, rotuloData; 
    JFormattedTextField cep, tel, cpf, data; //Criado um campo de dados que pode receber mascara 
    MaskFormatter mascaraCep, mascaraTel, mascaraCPF, mascaraData; //Criada as máscaras para os Fields
    JButton cadastrar;
    
    Janela(){
        super("Exemplo de JFormattedTextField");
        Container tela = getContentPane();
        setSize(400, 280);
        setLayout(null);
        
        rotuloCep = new JLabel("CEP: ");
        rotuloTel = new JLabel("Telefone: ");
        rotuloCPF = new JLabel("CPF: ");
        rotuloData = new JLabel("Data: ");
        
        cadastrar = new JButton("Cadastrar");
        
        rotuloCep.setBounds(50,40,100,20); //
        rotuloTel.setBounds(50,80,100,20);
        rotuloCPF.setBounds(50,120,100,20);
        rotuloData.setBounds(50,160,100,20);
        cadastrar.setBounds(120, 200, 100, 20);
        
        try {
            mascaraCep = new MaskFormatter("#####-###"); //Adicionado a máscara para cada campo
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
            
            mascaraCep.setPlaceholder("_"); //Esse é o placeholder de onde o usuário está digitando
            mascaraTel.setPlaceholder("_");
            mascaraCPF.setPlaceholder("_");
            mascaraData.setPlaceholder("_");
        }catch (ParseException ex) {
        }
        
        cep = new JFormattedTextField(mascaraCep);
        tel = new JFormattedTextField(mascaraTel);
        cpf = new JFormattedTextField(mascaraCPF);
        data = new JFormattedTextField(mascaraData);
        
        cep.setBounds(150,40,100,20);
        tel.setBounds(150,80,100,20);
        cpf.setBounds(150,120,100,20);
        data.setBounds(150,160,100,20);
        
        cadastrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(null, "Seu CEP é " + cep.getText() + "\n Seu telefone é " + tel.getText() + "\n Seu CPF é " + cpf.getText() + "\n A data é " + data.getText());
                    }
                }
        );
        
        tela.add(rotuloCep);
        tela.add(rotuloTel);
        tela.add(rotuloCPF);
        tela.add(rotuloData);
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        tela.add(cadastrar);
        
        setVisible(true);
     
    }
}
