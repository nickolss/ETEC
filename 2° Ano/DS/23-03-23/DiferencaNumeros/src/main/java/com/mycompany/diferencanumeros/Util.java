/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diferencanumeros;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Util {
    private int n1,n2;
    
    public void receberValores(){
        this.n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        this.n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
    }
    
    public void diferenca(){
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O número " + this.n1 + " é maior que o número " + this.n2);
        }else{
            JOptionPane.showMessageDialog(null, "O número " + this.n2 + " é maior que o número " + this.n1);
        }
    }
}
    
