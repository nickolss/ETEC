/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    public void exibirDialogo(){
        String num = JOptionPane.showInputDialog("Digite um número: ");
        JOptionPane.showMessageDialog(null, "O número digitado foi " + num);
    }
}
