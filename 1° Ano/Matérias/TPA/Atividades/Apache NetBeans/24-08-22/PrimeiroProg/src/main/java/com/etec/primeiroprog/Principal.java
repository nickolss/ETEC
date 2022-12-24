/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.primeiroprog;

import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Principal {
    public static String texto;
    public static void main(String[] args) {
        texto = JOptionPane.showInputDialog("Digite Seu Nome:");
        JOptionPane.showMessageDialog(null, "Uhull, seu nome é " + "\n"  + texto);
    }
}
