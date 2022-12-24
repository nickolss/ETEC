/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.cadastroaluno;
import javax.swing.JOptionPane;
/**
 * 
 *
 * @author dti
 */
public class Util {
    
    Aluno aluno = new Aluno();
    
    public Util(){
        System.out.println("Executando Construtor");
    }
    
    public void digitar(){
        aluno.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
        aluno.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura:")));

    }
    
    public void escrever(){
        JOptionPane.showMessageDialog(null, "Olá " + aluno.getNome() + "\n" + "Sua idade é " + aluno.getIdade() + " e sua altura é " + aluno.getAltura() + "\n" + "É Paulistano? " + aluno.getPaulistano());
    }
    
}
