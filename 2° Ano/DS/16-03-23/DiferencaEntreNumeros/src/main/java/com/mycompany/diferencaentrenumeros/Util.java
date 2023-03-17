/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diferencaentrenumeros;
import javax.swing.JOptionPane;
/**
 *
 * @author nicks
 */
public class Util {
    private double n1, n2;
    
    public void diferenca(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog( "Digite outro número: "));
                
        double diferenca;
        if (n1 > n2) {
            diferenca = n1-n2;
            JOptionPane.showMessageDialog(null, "A diferença entre o maior e o menor número é " + diferenca);
        }else{
            diferenca = n2-n1;
            JOptionPane.showMessageDialog(null, "A diferença entre o maior e o menor número é " + diferenca);
        }
    }
}
