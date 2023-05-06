/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroprofessor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Admin
 */
public class Janela extends JFrame{
    JLabel titulo, rotuloNome, rotuloMatricula, rotuloDisciplina, rotuloQuant;
    JTextField campoNome, campoMatricula, campoDisciplina, campoQuant;
    JButton cadastrar;
    
    Janela(){
        super("Cadastro de Professores");
        Container tela = getContentPane();
        setLayout(null);
        setSize(400, 300);
        
        titulo = new JLabel("Cadastro de Professores");
        rotuloNome = new JLabel("Nome: ");
        rotuloMatricula = new JLabel("Matricula: ");
        rotuloDisciplina = new JLabel("Disciplina: ");
        rotuloQuant = new JLabel("Qtd de aulas: ");
        cadastrar = new JButton("Confirmar Cadastro");
        
        campoNome = new JTextField(10);
        campoMatricula = new JTextField(10);
        campoDisciplina = new JTextField(10);
        campoQuant = new JTextField(10);
        
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        titulo.setBounds(20, 20, 250, 20);
        rotuloNome.setBounds(20, 60, 50, 20);
        rotuloMatricula.setBounds(20, 100, 80, 20);
        rotuloDisciplina.setBounds(20, 140, 80, 20);
        rotuloQuant.setBounds(20, 180, 80, 20);
        
        campoNome.setBounds(60, 60, 280, 20);
        campoMatricula.setBounds(80, 100, 80, 20);
        campoDisciplina.setBounds(80, 140, 260, 20);
        campoQuant.setBounds(100, 180, 80, 20);
        
        cadastrar.setBounds(120,220,160,20);
        
        cadastrar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mostrarDialog();
                }
            }
        );
        
        setVisible(true);
        tela.add(titulo);
        tela.add(rotuloNome);
        tela.add(rotuloMatricula);
        tela.add(rotuloDisciplina);
        tela.add(rotuloQuant);
        
        tela.add(campoNome);
        tela.add(campoMatricula);
        tela.add(campoDisciplina);
        tela.add(campoQuant);        
        
        tela.add(cadastrar);
    }
    
    public void mostrarDialog(){
        JOptionPane.showMessageDialog(null, "O nome é " + campoNome.getText() + "\n A matricula é " + campoMatricula.getText() + "\n A disciplina é " + campoDisciplina.getText() +
                "\n A quantidade de aulas é " + campoQuant.getText());
    }
}
