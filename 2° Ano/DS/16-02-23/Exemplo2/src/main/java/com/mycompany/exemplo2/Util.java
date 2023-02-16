/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    private int n1,n2,n3,n4, result;
    
    public void receberNumeros(){
        this.n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        this.n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        this.n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        this.n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "));
        
        this.result = (this.n1 * this.n2) + (this.n1 * this.n3) + (this.n1 + this.n4);
    }
    
    public void exibirResultados(){
        JOptionPane.showMessageDialog(null, "O resultado é " + this.result);
    }
}