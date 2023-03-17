/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hipotenusa;
import java.lang.Math;
import javax.swing.JOptionPane;
/**
 *
 * @author nicks
 */
public class Util {
    private double base, altura, hipotenusa;
    
    public void hipotenusa(){
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        this.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));
        
        double resultadoCatetos = Math.pow(this.altura, 2) + Math.pow(this.base, 2);
        this.hipotenusa = Math.sqrt(resultadoCatetos);
        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é " + this.hipotenusa + "m");
    }
}
