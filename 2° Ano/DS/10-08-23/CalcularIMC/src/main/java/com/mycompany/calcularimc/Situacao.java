/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimc;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Situacao {
    private String situacao;
    
    public void verificarSituacao(Imc pessoa){
        pessoa.calcularImc();
        if(pessoa.getImc() < 18.5){
            JOptionPane.showMessageDialog(null, "Abaixo do Peso" + pessoa.getImc());
        }else if(pessoa.getImc() >= 18.5 && pessoa.getImc()<=24.9){
            JOptionPane.showMessageDialog(null, "Adequado" + pessoa.getImc());
        }else if(pessoa.getImc() >= 25 && pessoa.getImc() <= 29.9){
            JOptionPane.showMessageDialog(null, "Sobrepeso" + pessoa.getImc());
        }else if(pessoa.getImc()>=30 && pessoa.getImc()<=34.9){
            JOptionPane.showMessageDialog(null, "Obesidade grau 1" + pessoa.getImc());
        }else if(pessoa.getImc() >= 35 && pessoa.getImc() <= 39.9){
            JOptionPane.showMessageDialog(null, "Obesidade grau 2" + pessoa.getImc());
        }else if(pessoa.getImc() >= 40){
            JOptionPane.showMessageDialog(null, "Obesidade grau 3" + pessoa.getImc());
        }
    }
}
