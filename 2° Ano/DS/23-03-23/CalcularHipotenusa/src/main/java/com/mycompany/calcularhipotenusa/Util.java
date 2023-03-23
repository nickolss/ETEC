/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularhipotenusa;
import java.lang.Math;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Util {
    private double cateto1, cateto2, hipotenusa;
    
    public void receberValores(){
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto: "));
    }
    
    public void calculcarHipotenusa(){
        this.hipotenusa = Math.sqrt((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2)));
        JOptionPane.showMessageDialog(null, "A hipotenusa é " + this.hipotenusa);
    }
}
