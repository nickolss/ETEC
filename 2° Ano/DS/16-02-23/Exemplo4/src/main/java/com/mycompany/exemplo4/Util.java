/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo4;
import java.lang.Math;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    private double X, N, result;
    
    public void receberValores(){
        this.X = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        this.N = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        this.result = Math.pow(2, (this.X * this.N));
    }
}
